package com.homework.company;


import com.homework.company.ZOO.Cow;
import com.homework.company.ZOO.Food;
import com.homework.company.shapes.Circle;
import com.homework.company.shapes.Rectangle;
import com.homework.company.shapes.Shape;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Black",10));
        shapes.add(new Circle("Yellow",7));
        shapes.add(new Rectangle("green",10,20));
        shapes.add(new Rectangle("white",30,10));

        for (Shape shape : shapes) {
            if(shape instanceof Rectangle){
                Rectangle r = (Rectangle) shape;
            }
            */
        Cow cow = new Cow(Food.GRASS,"Elza",400,300);
        cow.eat();
        cow.makeSound();

        }

    }

