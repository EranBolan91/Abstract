package com.homework.company.shapes;

/**
 * Created by Bolandian on 07/03/2017.
 */
public class Circle extends Shape {

    private double radius;

   public Circle(){

    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2*(Math.PI)*radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "" +
                "radius=" + radius +
                super.toString();
    }
}
