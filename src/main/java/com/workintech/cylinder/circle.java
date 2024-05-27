package com.workintech.cylinder;

public class circle {

    private double radius ;

    public circle(double radius) {
        this.radius = radius<0 ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }


}
