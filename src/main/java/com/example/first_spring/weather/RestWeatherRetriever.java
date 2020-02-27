package com.example.first_spring.weather;

import com.example.first_spring.weather.DTO.ForecastImportDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;



@Service
public class RestWeatherRetriever implements WeatherRetriever {
    private final RestTemplate restTemplate;
    //http://api.weatherapi.com/v1/forecast.json?key=3b84fcc031024ddc84a71129202602&q=Novosibirsk&days=1
    private final Logger logger = LoggerFactory.getLogger(RestWeatherRetriever.class);
    private static java.net.URI URI = java.net.URI.create("https://community-open-weather-map.p.rapidapi.com/weather");
    private static String API_URL = "http://api.weatherapi.com/v1/forecast.json?key=";
    MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();


    public RestWeatherRetriever(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ForecastImportDTO getForecast() {
        logger.debug("Запросили прогноз");
//        headers.add("x-rapidapi-host","community-open-weather-map.p.rapidapi.com");
//        headers.add("x-rapidapi-key","5ca16e2f72msh712306e3d9e9d42p1949f4jsn3de39cad8c90");
//        RequestEntity requestEntity = new RequestEntity(headers, HttpMethod.GET, URI);
//        ResponseEntity<String> result = restTemplate.exchange(requestEntity, String.class);
        ResponseEntity<ForecastImportDTO> result = restTemplate.getForEntity(API_URL + GetApiKey.getKey() + "&q=Novosibirsk&days=1", ForecastImportDTO.class);
        //todo NPEx check
        logger.debug("Получен прогноз для города{}", result.getBody().location.name);
        return result.getBody();
    }
}
