public class SameCallMethod {

    // Method with one integer parameter
    public static void display(int a) {
        System.out.println("Single parameter method called: " + a);
    }

    // Method with two integer parameters
    public static void display(int a, int b) {
        System.out.println("Two parameter method called: " + a + " and " + b);
    }

    public static void main(String[] args) {
        // Calling the first method
        display(10);

        // Calling the second method
        display(20, 30);
    }
}