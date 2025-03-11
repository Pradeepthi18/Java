// Parent class
class Parent {
    int x = 10;
    String name = "ParentClass";
}
// Child class
class Child extends Parent {
    int y = 20; // Shadowing parent's x
    void display() {
        // Accessing parent class fields using super
        System.out.println("Parent x: " + super.x);
        System.out.println("Parent name: " + super.name);

        // Accessing child class field
        System.out.println("Child y: " + this.y);
    }
}
// Main class
public class Super {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}