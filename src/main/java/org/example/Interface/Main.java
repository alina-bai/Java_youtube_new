package org.example.Interface;

public class Main {
    public static void main (String[] args ){

        //Interface
        //is a template that can be applied to a class.Similar to inheritance, but specifies
        //what a class must do.Classes may apply more than one interface,inheritance is limited to one superclass
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }

}
