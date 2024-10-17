package org.example;

public class printf {
    public static void main (String[] args) {

        int age = 25;
        String name = "Alice";
        double height = 5.6;

        System.out.printf("Name: %s%nAge: %d years old%nHeight: %.1f feet%n", name, age, height);

    }
}


        /*In Java, the printf method is used to format output.
        It belongs to the PrintStream class, which is part of the java.io package,
        and is commonly used with System.out.
        Basic Syntax:
        System.out.printf(String format, Object... args);

 format: A string that specifies how the output should be formatted.
args: The values to be formatted and printed.
Format Specifiers
The format string can include various format specifiers, which begin with a %. Here are some common ones:

%d: Integer
%f: Floating-point number
%s: String
%c: Character
%b: Boolean
%n: New line


Formating options:
You can also specify width and precision:

Width: Use %n.mf where n is the minimum width and m is the number of digits after the decimal.
Flags: You can add flags for additional formatting, like - for left justification, 0 for zero-padding.
ex:
//double pi = 3.14159;
  System.out.printf("Pi to 2 decimal places: %.2f%n", pi);
  System.out.printf("Padded number: %05d%n", 42);

  output:
  Pi to 2 decimal places: 3.14
  Padded number: 00042


Using printf in Java allows for powerful and flexible output formatting.





         */




