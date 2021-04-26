package com.tts.Animal;

public class Bear extends Animal{
private String bait;
    Bear(){
        super(15,"sam");
        System.out.println("The bear is to smart to take the bait.");
    }

    public void setBait(String bait){
        this.bait = bait;
    }
    public String getBait(){
        return bait;
    }


}
