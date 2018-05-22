package io.ramakant.spring.weatherservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class WeatherController {

    private String[] weathers = new String[]{"sunny", "cloudy", "rainy", "windy"};

    @GetMapping("/weather")
    public String getWeather(){
        int rand = ThreadLocalRandom.current().nextInt(0, 4);
        return weathers[rand];
    }
}
