package com.example.first_spring.weather;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestWeatherRetriever implements WeatherRetriever {
    private final RestTemplate restTemplate;
    private static String URL = "https://community-open-weather-map.p.rapidapi.com/weather";

    public RestWeatherRetriever(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getForecast() {
        ResponseEntity<String> result = restTemplate.getForEntity(URL,String.class);
        return result.getBody();
    }
}
