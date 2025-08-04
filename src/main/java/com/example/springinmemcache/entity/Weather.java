package com.example.springinmemcache.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "weather")
public class Weather {
    @Id
    @GeneratedValue
    int id;
    String city;
    String weatherDetails;
}
