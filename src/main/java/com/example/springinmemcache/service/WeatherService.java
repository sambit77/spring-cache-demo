package com.example.springinmemcache.service;

import com.example.springinmemcache.entity.Weather;
import com.example.springinmemcache.repository.WeatherRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WeatherService {

    @Autowired
    private final WeatherRepository weatherRepository;

    public List<Weather> getAllCityWeatherList() {
        return weatherRepository.findAll();
    }

    public Weather saveWeatherForCity(Weather weather) {
        return weatherRepository.save(weather);
    }

    public Weather getWeatherByCity(String city) {
        Optional<Weather> weatherOptional = weatherRepository.findByCity(city);
        return weatherOptional.get();
    }

    public String updateWeatherByCity(String city,String weatherUpdate) {
        weatherRepository.findByCity(city).ifPresent(weather -> {
            weather.setWeatherDetails(weatherUpdate);
            weatherRepository.save(weather);
        });
        return "Updated weather for " + city + " city is :- " + weatherUpdate;
    }

    @Transactional
    public void deleteWeatherByCity(String city) {
        weatherRepository.deleteByCity(city);
    }
}
