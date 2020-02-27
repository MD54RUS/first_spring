package com.example.first_spring.weather;

import com.example.first_spring.weather.DTO.ForecastImportDTO;

import java.util.List;

public interface ForecastDataService {

    void save(ForecastImportDTO forecast);
    List<ForecastImportDTO> getAll();
}
