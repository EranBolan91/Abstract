package com.homework.company.ZOO;

/**
 * Created by Bolandian on 09/03/2017.
 */
public class Cow extends Animal {

    private float weight;
    private float height;


    public Cow(Food food, String name, float weight, float height) {
        super(food, name);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void makeSound() {
        System.out.println("MOOOOOOOO");
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString() +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
