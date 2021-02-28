package com.lessons;

import com.lessons.create_patterns.builder.CarBuilder;
import com.lessons.create_patterns.builder.Director;
import com.lessons.create_patterns.prototype.Circle;
import com.lessons.create_patterns.prototype.Restangle;
import com.lessons.create_patterns.prototype.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        testBuilder();
        testPrototype();
    }

    private static void testPrototype() {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.setRadius(15);
        circle.setColor(Color.BLACK);
        circle.setX(10);
        circle.setY(20);
        shapes.add(circle);

        Shape clone = circle.clone();
        shapes.add(clone);

        Restangle restangle = new Restangle();
        restangle.setColor(Color.BLUE);
        restangle.setX(3);
        restangle.setY(4);
        restangle.setHeight(50);
        restangle.setWidth(30);

        shapes.add(restangle);
        System.out.println();
    }

    private static void testBuilder() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        carBuilder.getResult();
    }
}
