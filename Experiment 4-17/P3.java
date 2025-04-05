import mathematics.Calculator;
import mathematics.AdvancedCalculator;

public class P3 {
    public static void main(String[] args) {
        // Using basic calculator
        Calculator calc = new Calculator();
        System.out.println("Basic Calculator Operations:");
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
        
        // Using advanced calculator
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("\nAdvanced Calculator Operations:");
        System.out.println("Power (2^3): " + advCalc.power(2, 3));
        System.out.println("Square Root of 16: " + advCalc.squareRoot(16));
        System.out.println("Factorial of 5: " + advCalc.factorial(5));
        
        try {
            System.out.println(calc.divide(10, 0)); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}