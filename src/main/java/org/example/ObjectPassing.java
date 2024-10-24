package org.example;

public class ObjectPassing {
    public static void main (String[] args) {

        Garage garage = new Garage();
        Auto auto1 = new Auto("BMW");
        Auto auto2 = new Auto("Tesla");

        garage.park(auto1);
        garage.park(auto2);
    }
}
