package com.agelmahdi.simpletree;

public class Main {
    public static void main(String[] args) {
        Node animals = new Node("animals");

        Node predators = new Node("predators");
        Node pets = new Node("pets");

        animals.addChild(predators);
        animals.addChild(pets);

        Node cheetah = new Node("cheetah");
        Node tiger = new Node("tiger");

        predators.addChild(cheetah);
        predators.addChild(tiger);

        Node cats = new Node("cats");
        Node dogs = new Node("dogs");
        pets.addChild(cats);
        pets.addChild(dogs);

        System.out.println(animals.print(0));

    }
}
