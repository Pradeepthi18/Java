public class DiffCallMethod {

    // Method with one integer parameter
    public static void display(int a) {
        System.out.println("Integer parameter method called: " + a);
    }

    // Method with two parameters of different data types
    public static void display(String text, double value) {
        System.out.println("String and double parameter method called: " + text + " and " + value);
    }

    public static void main(String[] args) {
        // Calling the first method
        display(10);

        // Calling the second method
        display("Hello", 20.5);
    }
}