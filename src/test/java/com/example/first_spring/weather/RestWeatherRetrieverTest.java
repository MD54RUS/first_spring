package com.example.first_spring.weather;

import com.example.first_spring.FirstSpringApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.shell.jline.InteractiveShellApplicationRunner;
import org.springframework.shell.jline.ScriptShellApplicationRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(
        classes = FirstSpringApplication.class,
        properties = {
                InteractiveShellApplicationRunner.SPRING_SHELL_INTERACTIVE_ENABLED + "=false",
                ScriptShellApplicationRunner.SPRING_SHELL_SCRIPT_ENABLED + "=false"
        })
class RestWeatherRetrieverTest {

  @Autowired WeatherRetriever weatherRetriever;

  @Test
  void getForecast() {
    ForecastImportDTO result = weatherRetriever.getForecast();
    System.out.println(result);
  }
}
