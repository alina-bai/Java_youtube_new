package org.example;

public class Inheritance {
    public static void main (String[] args) {
        //Inheritance - is the process where one class acquires,
        // the attributes and methods of another

        Cars car = new Cars();

        //car.go();
        Bicycle byke = new Bicycle();
        //byke.stop();

        System.out.println(car.doors);
        System.out.println(byke.pedals);

    }
}
