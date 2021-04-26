package com.tts.Animal;

public class Snake extends Animal implements Breeding{
    public Snake(){
        super(3,"black");
        System.out.println("A snake has been found");
    }

    public void eat(){
        System.out.println("This snake is eating");
    }

    public void sleep(){
        System.out.println("This snake is sleeping");
    }

    @Override
    public void breed() {
        System.out.println("This snake is breeding");
    }
}
