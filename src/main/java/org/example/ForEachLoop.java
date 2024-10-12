package org.example;

public class ForEachLoop {
    public static void main (String[] args) {


        /*In Java, a for-each loop (also called the "enhanced for loop") is a simple way
        to iterate over elements in an array or a collection (like a list or set) without using an index.

        How it works:
        You don't need to keep track of the index (like in a traditional for loop).
        It automatically goes through each element, one at a time.
         Syntax:
         for (type variable : collection) {
        // Code to execute for each element
         }

         */

        int[] numbers = {1,2,3,4,5};
        for(int num: numbers){
            System.out.println(num);
        }
    }
}
