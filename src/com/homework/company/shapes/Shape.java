package com.homework.company.shapes;

/**
 * Created by Bolandian on 07/03/2017.
 */
public abstract class Shape {

    private String color;

   public Shape(){

    }

    protected Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                "color='" + color + '\'' +
                "Area='" + getArea() + '\'' +
                "Perimeter='" + getPerimeter() + '\'' +
                '}';
    }


}


