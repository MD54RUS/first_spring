package com.example.first_spring.weather.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LocationMap {
    public String name;
    public String region;
    public String country;
    public Float lat;
    public Float lon;
    public String tz_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date localtime_epoch;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date localtime;

}
//"location":{"name":"Novosibirsk","region":"Novosibirsk","country":"Russia","lat":55.04,"lon":82.93,
// "tz_id":"Asia/Novosibirsk","localtime_epoch":1583080462,"localtime":"2020-03-01 23:34"}