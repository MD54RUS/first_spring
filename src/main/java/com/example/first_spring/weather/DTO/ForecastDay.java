package com.example.first_spring.weather.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ForecastDay {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    String date;
    Day day = new Day();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public AstroDay getAstro() {
        return astro;
    }

    public void setAstro(AstroDay astro) {
        this.astro = astro;
    }

    AstroDay astro;
}
