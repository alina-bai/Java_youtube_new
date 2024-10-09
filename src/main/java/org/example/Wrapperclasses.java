package org.example;

public class Wrapperclasses {
    public static void main(String[] args) {
                // Autoboxing: Converting primitives into wrapper objects
                int primitiveInt = 42;
                Integer wrappedInt = primitiveInt; // Autoboxing

                double primitiveDouble = 3.14;
                Double wrappedDouble = primitiveDouble; // Autoboxing

                // Unboxing: Converting wrapper objects into primitives
                Integer anotherWrappedInt = new Integer(100);
                int unboxedInt = anotherWrappedInt; // Unboxing

                // Using wrapper class methods
                String numberString = "500";
                int parsedInt = Integer.parseInt(numberString); // Parsing string to int

                System.out.println("Primitive int: " + primitiveInt);
                System.out.println("Wrapped Integer: " + wrappedInt);
                System.out.println("Primitive double: " + primitiveDouble);
                System.out.println("Wrapped Double: " + wrappedDouble);
                System.out.println("Unboxed Integer: " + unboxedInt);
                System.out.println("Parsed Integer from String: " + parsedInt);
    }
}

