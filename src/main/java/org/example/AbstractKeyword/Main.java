package org.example.AbstractKeyword;

public class Main {
    public static void main (String[] args){
        // Abstract classes cannot be instatiated, but they can have a subclass
        // Abstract method are declared without an implementation

        Car car = new Car();
        //Vehicle vehicle = new Vehicle();
        car.go();
    }
}
