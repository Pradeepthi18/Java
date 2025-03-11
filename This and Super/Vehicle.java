class Vehicle {
    int speed;
    String model;
    Vehicle(int speed, String model) {
        this.speed = speed;  
        this.model = model;  
    }
    // Method to print instance members using 'this'
    void printFields() {
        System.out.println("Speed: " + this.speed);
        System.out.println("Model: " + this.model);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(120, "Toyota");
        vehicle.printFields();
    }
}
