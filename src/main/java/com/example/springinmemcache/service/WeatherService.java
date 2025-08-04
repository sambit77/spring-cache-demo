package com.example.springinmemcache.service;

import com.example.springinmemcache.entity.Weather;
import com.example.springinmemcache.repository.WeatherRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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

    @Cacheable(value = "weather", key = "#city")
    public String getWeatherByCity(String city) {
        Optional<Weather> weatherOptional = weatherRepository.findByCity(city);
        return weatherOptional.get().getWeatherDetails();
    }

    @CachePut(value = "weather",key = "#city")
    public String updateWeatherByCity(String city,String weatherUpdate) {
        weatherRepository.findByCity(city).ifPresent(weather -> {
            weather.setWeatherDetails(weatherUpdate);
            weatherRepository.save(weather);
        });
        return weatherUpdate;
    }

    @Transactional
    @CacheEvict(value = "weather",key = "#city")
    public void deleteWeatherByCity(String city) {
        weatherRepository.deleteByCity(city);
    }
}
