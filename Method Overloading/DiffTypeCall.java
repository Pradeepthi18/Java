public class DiffTypeCall {
    // Method with int parameters
    static void show(int a, int b) {
        System.out.println("Integer method called: Sum = " + (a + b));
    }

    // Method with String parameters
    static void show(String a, String b) {
        System.out.println("String method called: Concatenation = " + (a + " " + b));
    }

    public static void main(String[] args) {
        // Calling the method with int parameters
        show(10, 20);

        // Calling the method with String parameters
        show("Hello", "World");
    }
}