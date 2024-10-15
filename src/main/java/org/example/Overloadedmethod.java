class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class Overloadedmethod {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the method with two integer parameters
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));

        // Calls the overloaded method with three integer parameters
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));

        // Calls the overloaded method with two double parameters
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.2));
    }
}