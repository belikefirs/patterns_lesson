package com.lessons.create_patterns.factory_method;

public class RoadLogistic implements Logistic {
    @Override
    public Transport createTransport() {
        return new Truck();
    }

    @Override
    public void planDelivery() {
        System.out.println("По земле");
    }
}
