package com.homework.company.shapes;

/**
 * Created by Bolandian on 07/03/2017.
 */
public class Rectangle extends Shape {

    private  int a;
    private int b;


    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return
                "a=" + a +
                ", b=" + b +
                super.toString();
    }

    //getters and setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
