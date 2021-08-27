package com.agelmahdi.stackqueuequestions.AnimalShelter;

public class Cat extends Animal {

    public Cat(String n){
        super(n);
    }

    @Override
    public String name() {
        return "Cat: " + name;
    }
}
