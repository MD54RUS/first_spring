package com.example.first_spring.weather;

import com.example.first_spring.weather.DTO.ForecastImportDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class JdbcForecastDataService implements ForecastDataService {
    private final JdbcTemplate jdbcTemplate;

    public JdbcForecastDataService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(ForecastImportDTO forecast) {
        jdbcTemplate.update("insert into forecasts (forecast) values (?)", forecast);
    }

    @Override
    public List<ForecastImportDTO> getAll() {

        List<Object> res = jdbcTemplate.query("select forecast from forecasts",
                (rs, rowNum) -> rs.getObject("forecast"));
        List<ForecastImportDTO> result = new LinkedList<>();
        res.forEach(s -> result.add((ForecastImportDTO) s));
        return result;
    }
}
