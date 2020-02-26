package com.example.first_spring.weather;

import java.util.List;

public interface ForecastDataService {
    void save(ForecastImportDTO forecast);

    List<ForecastImportDTO> getAll();
}
