class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    // Method in the Dog class using 'this' to call another method in the same class
    public void makeSound() {
        this.bark();  // Calling a method within the same class using 'this'
    }
    // Another method in the Dog class
    public void bark() {
        System.out.println("Bark! Bark!");
    }
    // Method using 'super' to call the method from the superclass (Animal)
    public void callSuperSound() {
        super.sound();  // Calling the superclass's sound method
    }
}
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling method that uses 'this'
        dog.makeSound();  // Calls the 'bark' method using 'this'
        
        // Calling method that uses 'super'
        dog.callSuperSound();  // Calls the 'sound' method of Animal class using 'super'
    }
}
