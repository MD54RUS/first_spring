package com.example.first_spring.weather.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CurrentWeather {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date last_updated;
    public float temp_c;
    public boolean is_day;
    public ConditionWeather condition;
    public float wind_kph;
    public float wind_degree;
    public String wind_dir;
    public float pressure_mb;
    public float pressure_in;
    public float precip_mm;
    public float precip_in;
    public int humidity;
    public int cloud;
    public float feelslike_c;
    public float vis_km;
    public float uv;
    public float gust_kph;
}
//"current":{"last_updated":"2020-03-01 23:30","temp_c":-2.0,"is_day":0,
//        "condition":{"text":"Clear","icon":"//cdn.weatherapi.com/weather/64x64/night/113.png","code":1000}
//        ,"wind_kph":11.2,"wind_degree":150,"wind_dir":"SSE","pressure_mb":1026.0,"pressure_in":30.8,"precip_mm":0.0,
//        "precip_in":0.0,"humidity":80,"cloud":0,"feelslike_c":-6.0,"vis_km":10.0,"uv":0.0,"gust_kph":23.0},
