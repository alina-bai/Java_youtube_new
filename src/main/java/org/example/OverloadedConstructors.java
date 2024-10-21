package org.example;

public class OverloadedConstructors {
    public static void main (String[] args) {
        Pizza pizza = new Pizza("thick crust", "tomato", "mozarella");
        System.out.println("These are ingridients for your pizza:  ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


        // Multiple constuctors within a class with the same name, but have different parameters
        //name + parameters = signature

    }

}
