package com.lessons.create_patterns.builder;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset();
        builder.setEngine();
        builder.setGPS();
    }
}
