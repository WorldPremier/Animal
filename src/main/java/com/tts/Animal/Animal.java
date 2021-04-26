package com.tts.Animal;

public abstract class Animal {

    private int age;
    private String name;

    public Animal(int age, String name){
        //refers to the class instance
        //this is an example of databinding.
        this.age = age;
        this.name = name;
        System.out.println("An animal has been created!");
    }

    public void eat(){
        System.out.println("A animal is eating");
    }
    public void sleep(){
        System.out.println("An animal is sleeping");
    }

    public int getAge(){

        return age;
    }
    public String getName(){
        return name;
    }

//    public String getBear();


    public static void main(String[] args) {

        //below is how we instantiate Dog.
        //note "new Dog()" is directly invoking the constructor.

        Dog d = new Dog();//d is creating an instance of the calss Dog;
        Cat c = new Cat();
        Parrot p = new Parrot();
        Snake s = new Snake();
        Lion l = new Lion();
        Tiger t = new Tiger();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();
        p.eat();
        p.sleep();
        s.eat();
        s.sleep();
        System.out.println(p.getAge() + " " + p.getName());
        System.out.println(l.getAge() + " " + l.getName());
        System.out.println(t.getAge() + " " + t.getName());
        s.breed();
        p.breed();
        //************** invoking the setters & getters methods ******************
        d.setBiteForce(200);
        System.out.println("Here is the bite force on my German Shepard: " + d.getBiteForce());
    }

}
