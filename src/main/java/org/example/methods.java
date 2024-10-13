package org.example;

public class methods {
    public static void main (String[] args) {

        //A method is a set of instructions grouped together to perform an operation.
        // You can call a method whenever you want to reuse that operation, which helps reduce code duplication.

        //Why use Methods?
        //Reusability: Write once, use multiple times.
        //Readability: Breaking down large problems into smaller, manageable parts.
        //Modularity: Organizes code into blocks for better structure.

        /*Basic Structure of a Method:
        returnType methodName(parameters) {
    // Code to execute
}
returnType: The type of value the method will return (e.g., int, String, etc.). If it doesn't return anything, use void.
methodName: The name of the method (it should describe what the method does).
parameters: Input values the method can take. These are optional.
         */

        /* Example of simple method:
        public void sayHello() {
            System.out.println("Hello, World!");
        }
       Calling a method:
        public class Main {
    public static void main(String[] args) {
        Main obj = new Main();  // Create an object of the Main class
        obj.sayHello();  // Call the sayHello() method
    }

    public void sayHello() {
        System.out.println("Hello, World!");
    }
}
Method with parameters:
Methods can take parameters (input values) that allow you to pass data to them.
For example, a method that adds two numbers:
public int addNumbers(int a, int b) {
    return a + b;
}
Parameters: int a and int b are inputs for the method.
Return type: int indicates that the method will return an integer.
Now, you can call the method and pass values to it:
public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        int sum = obj.addNumbers(5, 10);
        System.out.println("Sum: " + sum);
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }
}
Methods with Return Values
If a method has a return type (like int), it must return a value of that type using the return keyword.
 For example, in the addNumbers method, return a + b; sends back the result of the addition to where the method was called.

Overloading Methods
In Java, you can have multiple methods with the same name, but with different parameters.
 This is called method overloading.

 public int multiply(int a, int b) {
    return a * b;
}

public double multiply(double a, double b) {
    return a * b;
}
Here, the method multiply is overloaded: one version works with integers and another with doubles.

Summary
A method is a block of code that performs a specific task.
It can have a return type or be void (no return value).
It can take parameters or have none.
You can call methods from within other methods or from objects of a class.


       */


    }
}
