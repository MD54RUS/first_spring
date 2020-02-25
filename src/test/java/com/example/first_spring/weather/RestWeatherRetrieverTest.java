package com.example.first_spring.weather;

import com.example.first_spring.FirstSpringApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = FirstSpringApplication.class)
class RestWeatherRetrieverTest {

  @Autowired WeatherRetriever weatherRetriever;

  @Test
  void getForecast() {
    String result = weatherRetriever.getForecast();
    System.out.println(result);
  }
}
