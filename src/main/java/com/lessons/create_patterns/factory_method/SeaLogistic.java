package com.lessons.create_patterns.factory_method;

public class SeaLogistic implements Logistic {
    @Override
    public Transport createTransport() {
        return new Ship();
    }

    @Override
    public void planDelivery() {
        System.out.println("По морю");
    }
}
