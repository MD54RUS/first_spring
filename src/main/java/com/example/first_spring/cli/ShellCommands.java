package com.example.first_spring.cli;

import com.example.first_spring.weather.DTO.ForecastImportDTO;
import com.example.first_spring.weather.ForecastDataService;
import com.example.first_spring.weather.WeatherRetriever;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.stream.Collectors;

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
  public String get(@ShellOption(defaultValue = "Novosibirsk") String city) {

    lastForecast = weatherRetriever.getForecast(city);
    return lastForecast.getLocation().getName() + " " + lastForecast.getCurrent().getTemp_c();
  }

  // todo need serialization for DTO
  @ShellMethod("Сохрани текущий прогноз.")
  public String save() {
    if (lastForecast != null) {
      forecastDataService.save(lastForecast);
      return "Сохранено";
    } else return "Сначала загрузите прогноз";
  }

  @ShellMethod("Покажи все сохраненные прогнозы")
  public String show() {
    // final String[] result = new String[1];
    // forecastDataService.getAll().forEach(s -> result[0] += s.toString());
    return forecastDataService.getAll().stream()
            .collect(Collectors.joining(System.lineSeparator()));
    // return result[0];
  }
}
