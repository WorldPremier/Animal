package com.tts.Animal;

public class Dog extends Animal{

    public Dog(){
        super(15,"sunny");
        System.out.println("A dog has been created");
    }

    @Override
    public void eat(){
        System.out.println("A dog is eating");
    }

    public void sleep(){
        System.out.println("A dog is sleeping");
    }

//    public abstract eat();
    public void ruff(){
        System.out.println("The dog says ruff");
    }


    public void run(){
        System.out.println("A dog is running");
    }
    //********* setters & getters *****************
    private int biteForce;

    public void setBiteForce(int biteForce){
        this.biteForce = biteForce;
    }
    public int getBiteForce(){
        return biteForce;
    }
}
