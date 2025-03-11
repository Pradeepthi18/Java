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
class Bike extends Vehicle {
    Bike(int speed) {
        super(speed);
    }
    @Override
    void startEngine() {
        System.out.println("Bike engine started...");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Vehicle myVehicle = new Bike(80); 
        myVehicle.startEngine(); 
        myVehicle.showSpeed();   
    }
}
