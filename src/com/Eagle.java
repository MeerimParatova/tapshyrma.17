package com;

import com.Animal;

public class Eagle extends Animal {
public void fly(){
    System.out.println("com.Eagle fly");
}

    @Override
    public void eat() {
        System.out.println("com.Eagle eat");
    }
}
