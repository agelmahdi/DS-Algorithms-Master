package com.agelmahdi.stackqueuequestions.AnimalShelter;

public class Dog extends Animal {

    public Dog(String n){
        super(n);
    }

    @Override
    public String name() {
        return "Dog: " + name;
    }
}
