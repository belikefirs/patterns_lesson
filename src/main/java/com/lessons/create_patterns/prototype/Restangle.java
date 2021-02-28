package com.lessons.create_patterns.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Restangle extends Shape {

    private Integer width;
    private Integer height;

    public Restangle(Restangle source) {
        super(source);
        if(source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    public Restangle() {

    }

    @Override
    public Shape clone() {
        return new Restangle(this);
    }
}
