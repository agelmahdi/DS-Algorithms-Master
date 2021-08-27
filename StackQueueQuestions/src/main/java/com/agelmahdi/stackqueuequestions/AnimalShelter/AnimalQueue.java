package com.agelmahdi.stackqueuequestions.AnimalShelter;

import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    /*
    * dequeueAny
    * dequeueDog
    * dequeueCat
    * */

    public void enQueue(Animal animal){
        animal.setOrder(order);
        order++;
        if (animal instanceof Dog){
            dogs.addLast((Dog) animal);
        }
        else if(animal instanceof Cat){
            cats.addLast((Cat) animal);

        }

    }
    public Animal deQueueAny(){
        if (dogs.size() ==0){
            return deQueueCat();
        }
        else if (cats.size() == 0){
            return deQueueDog();
        }
        Dog dog = peekDog();
        Cat cat = peekCat();

        if (dog.isOlderThan(cat)){
            return dogs.poll();
        }
        else {
            return cats.poll();

        }
    }

    public Animal peek(){
        if (dogs.size()==0){
            return cats.peek();
        }
        else {
            return dogs.peek();

        }
    }

    public Dog deQueueDog(){
       return dogs.poll();
    }
    public Cat deQueueCat(){
       return cats.poll();
    }

    public Dog peekDog(){
        return dogs.peek();
    }
    public Cat peekCat(){
        return cats.peek();
    }

    public int getSize(){
        return dogs.size()+cats.size();
    }
}
