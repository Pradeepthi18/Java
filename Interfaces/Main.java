// Step 1: Define the interface with two methods
interface Vehicle {
    void start();          // Method to start the vehicle
    void stop();           // Method to stop the vehicle
}

// Step 2: Implement the interface in a class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car has started.");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }
}

// Step 3: Use the interface instance in the main method
public class Main {
    public static void main(String[] args) {
        // Create an instance of Car using the Vehicle interface
        Vehicle myCar = new Car();
        
        // Call the implemented methods
        myCar.start(); // Output: The car has started.
        myCar.stop();  // Output: The car has stopped.
    }
}
