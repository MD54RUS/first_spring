package com.example.first_spring.weather.DTO;

// todo need serialization for DTO
public class ForecastImportDTO2 {
    public LocationMap location;
    public CurrentWeather currentWeather;
    public ForecastWeather forecast;
}
// {,"forecast":{"forecastday":[{"date":"2020-03-01","day":{"maxtemp_c":0.1,"mintemp_c":-4.8,"avgtemp_c":-2.1,"maxwind_kph":15.5,"totalprecip_mm":0.1,"totalprecip_in":0.0,"avgvis_km":9.4,"avghumidity":96.0,"condition":{"text":"Overcast","icon":"//cdn.weatherapi.com/weather/64x64/day/122.png","code":1009},"uv":1.7},"astro":{"sunrise":"08:18 AM","sunset":"07:04 PM","moonrise":"10:44 AM","moonset":"01:14 AM"}}]},"alert":{}}
