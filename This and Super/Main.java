class Parent {
    Parent() {
        System.out.println("Parent class constructor called");
    }
}
class Child extends Parent {
    Child() {
        // Calling the parent class constructor
        super();
        System.out.println("Child class constructor called");
    }
    // You can add some method to use the child object
    void greet() {
        System.out.println("Hello from Child class!");
    }
}
public class Main {
    public static void main(String[] args) {
        Child child = new Child();  // This will call both Parent and Child constructors
        // Using the child object to call a method
        child.greet();
    }
}
