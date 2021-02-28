package com.lessons.create_patterns.prototype;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public abstract class Shape {

    private Integer x;
    private Integer y;
    private Color color;

    public abstract Shape clone();

    public Shape() {
    }

    public Shape(Shape source) {
        if(source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }
}
