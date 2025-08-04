package com.example.springinmemcache.controller;

import com.example.springinmemcache.entity.Weather;
import com.example.springinmemcache.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    @Autowired
    private final WeatherService weatherService;

    @GetMapping()
    public List<Weather> getAllCityWeatherList()
    {
        System.out.println("Getting all weather city list.....");
        return weatherService.getAllCityWeatherList();
    }

    @PostMapping()
    public Weather saveWeatherForCity(@RequestBody Weather weather)
    {
        System.out.println("Saving weather details to DB "+weather);
        return weatherService.saveWeatherForCity(weather);
    }

    @GetMapping("/{city}")
    public Weather getWeatherForId(@PathVariable String city)
    {
        System.out.println("Getting weather for city "+city);
        return weatherService.getWeatherByCity(city);
    }

    @PutMapping("/{city}")
    public String updateWeatherByCity(@PathVariable String city,@RequestParam String weatherUpdate)
    {
       return weatherService.updateWeatherByCity(city,weatherUpdate);
    }

    @DeleteMapping("/{city}")
    public void deleteWeatherByCity(@PathVariable String city)
    {
        weatherService.deleteWeatherByCity(city);
    }

}
