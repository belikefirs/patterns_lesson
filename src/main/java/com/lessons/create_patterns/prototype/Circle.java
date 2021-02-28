package com.lessons.create_patterns.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape {

    private Integer radius;

    public Circle() {
        super();
    }

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}

