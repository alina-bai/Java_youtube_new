import java.lang.reflect.Array;
import java.util.ArrayList;
//package org.example;

public class TwodArraylist {
    public static void main (String[] args) {

        ArrayList<ArrayList<String>> grocerylist = new ArrayList<>();


        ArrayList <String> bakerylist = new ArrayList<>();
        bakerylist.add("Pasta");
        bakerylist.add("Garlic bread");
        bakerylist.add("Donuts");

        ArrayList <String> productlist = new ArrayList<>();
        productlist.add("Potato");
        productlist.add("Garlic");
        productlist.add("Cucumber");

        ArrayList <String> drinkslist = new ArrayList<>();
        drinkslist.add("Juice");
        drinkslist.add("Water");
        drinkslist.add("Laban");

        grocerylist.add(bakerylist);
        grocerylist.add(productlist);
        grocerylist.add(drinkslist);

        System.out.println(grocerylist);


    }
}
