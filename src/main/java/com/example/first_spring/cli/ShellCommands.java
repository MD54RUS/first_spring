package com.example.first_spring.cli;

import com.example.first_spring.weather.DTO.ForecastImportDTO;
import com.example.first_spring.weather.ForecastDataService;
import com.example.first_spring.weather.WeatherRetriever;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellCommands {
  private final WeatherRetriever weatherRetriever;
  private final ForecastDataService forecastDataService;

  public ShellCommands(WeatherRetriever weatherRetriever, ForecastDataService forecastDataService) {
    this.weatherRetriever = weatherRetriever;
    this.forecastDataService = forecastDataService;
  }

  private ForecastImportDTO lastForecast;

  @ShellMethod("Загрузи прогноз.")
  public ForecastImportDTO getForecast() {
    lastForecast = weatherRetriever.getForecast();
    return lastForecast;
  }

  //todo need serialization for DTO
  @ShellMethod("Сохрани текущий прогноз.")
  public String save() {
    if (lastForecast != null) {
      forecastDataService.save(lastForecast);
      return "Сохранено";
    } else return "Сначала загрузите прогноз";
  }

  @ShellMethod("Покажи все сохраненные прогнозы")
  public String show() {
    final String[] result = new String[1];
    forecastDataService.getAll().forEach(s -> result[0] += s.toString());
    return result[0];
  }
}
