// Define a public interface with fields and a method
// Implementing class
class MyClass implements MyInterface1 {
    @Override
    public void showMessage() {
        System.out.println("Hello, this is the interface method.");
    }
}

// Main class to run the program
public class main7 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Print interface field values
        System.out.println("Name: " + MyInterface1.NAME);
        System.out.println("Value: " + MyInterface1.VALUE);

        // Call the interface method
        obj.showMessage();
    }
}