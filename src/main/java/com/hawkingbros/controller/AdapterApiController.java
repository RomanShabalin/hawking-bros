package com.hawkingbros.controller;

import com.google.gson.*;
import io.swagger.api.AdapterApi;
import io.swagger.model.*;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.CompletableFuture;

@Controller
public class AdapterApiController implements AdapterApi {
    private final RestTemplate restTemplate;
    private final String apiUrl = "https://api.open-meteo.com/v1/forecast?";
    private final String current = "temperature_2m";
    private final String dateFormat = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    public AdapterApiController() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    public CompletableFuture<ResponseEntity<MsgB>> execute(MsgA body) {
        try {
            if (body.getLng().equals(MsgA.LngEnum.RU)) {
                if (body.getMsg() == null || body.getMsg().trim().isEmpty() || body.getMsg().trim().isBlank())
                    return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));

                HttpHeaders headers = new HttpHeaders();
                headers.set("Accept", "application/json");

                URI uri = UriComponentsBuilder
                        .fromUri(new URI(apiUrl))
                        .queryParam("latitude", body.getCoordinates().getLatitude())
                        .queryParam("longitude", body.getCoordinates().getLongitude())
                        .queryParam("current", current)
                        .build()
                        .toUri();

                Gson gson = (new GsonBuilder()).create();
                String json = gson.toJson(body);

                RequestEntity requestEntity = new RequestEntity(json, headers, HttpMethod.GET, uri);
                ResponseEntity<OpenMeteoResponse> responseEntity = restTemplate.exchange(requestEntity, OpenMeteoResponse.class);

                MsgB response = new MsgB();
                response.setTxt(body.getMsg());
                response.setCreatedDt(OffsetDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat)));
                response.setCurrentTemp(String.valueOf(responseEntity.getBody().getCurrent().getTemperature2m()));

                return CompletableFuture.completedFuture(new ResponseEntity<>(response, HttpStatus.OK));
            }

            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.BAD_REQUEST));
        } catch (Exception e) {
            e.printStackTrace();
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }
}
