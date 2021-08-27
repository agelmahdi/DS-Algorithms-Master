package com.agelmahdi.stackqueuequestions.AnimalShelter;

public abstract class Animal {
    protected String name;
    private int order;

    public Animal(String name){
        this.name = name;
    }

    public abstract String name();

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public boolean isOlderThan(Animal animal){
        return this.order < animal.getOrder();
    }
}
