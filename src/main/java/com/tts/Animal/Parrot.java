package com.tts.Animal;

public class Parrot extends Animal implements Breeding{
    public Parrot(){
         super(20,"Picasso");
        System.out.println("This parrot extends the Animal class");
    }

    @Override
    public void eat(){
        System.out.println("This parrot is eating");
    }

    @Override
    public void sleep(){
        System.out.println("This parrot is sleeping");
    }

    @Override
    public void breed(){
        System.out.println("This Parrot is breeding or laying eggs");
    }

}
