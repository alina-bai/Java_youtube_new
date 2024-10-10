
import java.util.ArrayList;

//package org.example;

public class ArrayListsPractice {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("lagman");
        food.add("plov");

        // Изменяем первый элемент
        food.set(0, "sushi");

        // Удаляем элемент на индексе 2
        food.remove(2);

        food.clear();

        // Выводим список на экран
        System.out.println(food);
    }
}


