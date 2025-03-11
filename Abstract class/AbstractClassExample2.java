// Abstract class
abstract class Vehicle {
    int speed;  
    Vehicle(int speed) {
        this.speed = speed;
    }
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
    void createInstanceAndCallMethods() {
        Car myCar = new Car(120); 
        myCar.showSpeed();        
        myCar.fuelType();         
    }
}
public class AbstractClassExample2 {
    public static void main(String[] args) {
        Car obj = new Car(100);
        obj.createInstanceAndCallMethods();
    }
}