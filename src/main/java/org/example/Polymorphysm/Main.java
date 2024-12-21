package org.example.Polymorphysm;

public class Main {
    public static void main (String []args){
        //polymorphysm - poly is "many" and morph is "form".
        //The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, boat, bicycle};

        for (Vehicle x : racers){
            x.go();
        }
    }
}
