package com.example.first_spring.weather.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class ForecastDay {
    Date date;
    BigDecimal date_epoch;
    Day day;
    float uv;
    AstroDay astro;
}
