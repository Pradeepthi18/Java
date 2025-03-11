class SameTypeCall {

    // Method with int parameters
    static void display(int a, int b) {
        System.out.println("Integer method called: Sum = " + (a + b));
    }

    // Method with double parameters
    static void display(double a, double b) {
        System.out.println("Double method called: Sum = " + (a + b));
    }

    public static void main(String[] args) {
        // Calling the integer method
        display(5, 10);

        // Calling the double method
        display(5.5, 2.5);
    }
}