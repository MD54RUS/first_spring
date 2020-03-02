package com.example.first_spring.weather;

import com.example.first_spring.weather.DTO.ForecastImportDTO;

public interface WeatherRetriever {
    ForecastImportDTO getForecast(String city);
}
