package com;


public class Main {
    public static void main(String[] args) {


        Animal[] animals = {new Shark(), // полимарфизм  родительский класстын тибин колдонуп дочерный класстын обьектисин тузуу
                new Turtle(),
                new Eagle()
        };
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            } else {
                ((Eagle) animal).fly();
//instnceof келген обьекти ушулбу деген суроо менен текшерет.
            }
        }


    }
    }