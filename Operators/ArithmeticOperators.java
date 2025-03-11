public class ArithmeticOperators {
    
    // Function to perform arithmetic operations
    public static void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        
        // Checking if denominator is not zero before division
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }
    }
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        calculate(num1, num2);
    }
}