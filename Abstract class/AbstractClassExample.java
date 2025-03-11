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
    void fuelType() {
        System.out.println("This vehicle uses petrol.");
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
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Car myCar = new Car(100);
        myCar.showSpeed();  
        myCar.fuelType();  
        myCar.startEngine();
    }
}