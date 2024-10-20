package org.example;

public class Constructor {
    public static void main (String[] args) {

        Human human = new Human("Rick",75,70);
        Human human2 = new Human("MArty", 45,69);
        System.out.println(human.age);
        System.out.println(human2.name);

        human2.eat();
        human.drink();

    }
}
