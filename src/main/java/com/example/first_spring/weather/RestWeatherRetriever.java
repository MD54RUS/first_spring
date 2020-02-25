package com.example.first_spring.weather;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


@Service
public class RestWeatherRetriever implements WeatherRetriever {
    private final RestTemplate restTemplate;
    private static java.net.URI URI = java.net.URI.create("https://community-open-weather-map.p.rapidapi.com/weather");
    MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();


    public RestWeatherRetriever(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getForecast() {
        headers.add("x-rapidapi-host","community-open-weather-map.p.rapidapi.com");
        headers.add("x-rapidapi-key","5ca16e2f72msh712306e3d9e9d42p1949f4jsn3de39cad8c90");
        RequestEntity requestEntity = new RequestEntity(headers, HttpMethod.GET, URI);
        ResponseEntity<String> result = restTemplate.exchange(requestEntity, String.class);
        return result.getBody();
    }
}
