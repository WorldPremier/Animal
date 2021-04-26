package com.tts.Animal;
import java.util.*;


public class Cat extends Animal{

    public Cat(){
       super(7,"katy");
       System.out.println("A cat has been created");
   }

   @Override
   public void eat(){
       System.out.println("A cat is eating");
   }

   public void sleep(){
       System.out.println("A cat is sleeping");
   }

   public void meow(){
       System.out.println("A cat meows");
   }

}
