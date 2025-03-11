// Abstract class
abstract class Vehicle {
    int speed;  
    Vehicle(int speed) {
        this.speed = speed;
    }
    abstract void startEngine();
    void showSpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }
}
class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }
    @Override
    void startEngine() {
        System.out.println("Car engine started...");
    }
    void createInstanceAndCallMethods() {
        Car myCar = new Car(120); 
        myCar.startEngine();      
        myCar.showSpeed();      
    }
}

public class AbstractClassExample1 {
    public static void main(String[] args) {
        Car obj = new Car(100);
        obj.createInstanceAndCallMethods();
    }
}