package com.example.first_spring.cli;

import com.example.first_spring.weather.WeatherRetriever;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellCommands {
    private final WeatherRetriever weatherRetriever;

    public ShellCommands(WeatherRetriever weatherRetriever) {
        this.weatherRetriever = weatherRetriever;
    }

    @ShellMethod("Загрузи прогноз.")
    public String getForecast() {
        return weatherRetriever.getForecast().location.name;
    }
}
