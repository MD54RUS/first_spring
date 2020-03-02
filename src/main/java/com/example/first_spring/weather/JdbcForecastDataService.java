package com.example.first_spring.weather;

import com.example.first_spring.weather.DTO.ForecastImportDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdbcForecastDataService implements ForecastDataService {
  private final JdbcTemplate jdbcTemplate;

  public JdbcForecastDataService(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void save(ForecastImportDTO forecastIn) {
    System.out.println(forecastIn);
    System.out.println(
            forecastIn.getForecast());
    System.out.println(forecastIn.getForecast().getForecastday().size());
    System.out.println(forecastIn.getForecast().getForecastday().get(0).getDay().getAvgTempC());
    System.out.println(jdbcTemplate);
    jdbcTemplate.update(
            "insert into forecasts (forecast) values (?)",
            forecastIn.getForecast().getForecastday().get(0).getDate()
                    + " "
                    + forecastIn.getLocation().getName()
                    + " "
                    + forecastIn.getForecast().getForecastday().get(0).getDay().getAvgTempC());
  }

  @Override
  public List<String> getAll() {

    List<String> res =
            jdbcTemplate.query(
                    "select forecast from forecasts", (rs, rowNum) -> rs.getString("forecast"));
    return res;
  }
}
