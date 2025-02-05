package org.example;

public class WrapperExample {
    public static void main(String[] args) {
        // Primitive int
        int num = 10;

        // Boxing: Converting primitive int to Integer object
        Integer wrappedNum = Integer.valueOf(num);

        // Unboxing: Converting Integer object back to primitive int
        int unwrappedNum = wrappedNum.intValue();

        // Auto-boxing and Auto-unboxing (Java automatically handles this)
        Integer autoBoxedNum = num; // Auto-boxing
        int autoUnboxedNum = autoBoxedNum; // Auto-unboxing

        // Display results
        System.out.println("Primitive int: " + num);
        System.out.println("Wrapped Integer: " + wrappedNum);
        System.out.println("Unwrapped int: " + unwrappedNum);
        System.out.println("Auto-boxed Integer: " + autoBoxedNum);
        System.out.println("Auto-unboxed int: " + autoUnboxedNum);
    }
}