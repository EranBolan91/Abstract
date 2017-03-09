package com.homework.company.ZOO;

/**
 * Created by Bolandian on 07/03/2017.
 */
public abstract class Animal {

    private Food food;
    private String name;

    public Animal(Food food, String name) {
        this.food = food;
        this.name = name;
    }

    public void eat(){

        System.out.println("Eating " + food);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food=" + food +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void makeSound();
}
