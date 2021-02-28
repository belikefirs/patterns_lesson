package com.lessons.create_patterns.builder;

public class CarBuilder implements Builder {

    Car car = new Car();

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeat() {
        car.setSeats(new String[]{"Сиденья"});
    }

    @Override
    public void setEngine() {
        car.setEngine("Движок");
    }

    @Override
    public void setTripComputer() {
        car.setTripComputer("Мозги");
    }

    @Override
    public void setGPS() {
        car.setGps("GPS");
    }

    public Car getResult() {
        return car;
    }
}
