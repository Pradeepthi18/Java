class MyClass {
    int x;
    int y;
    // Constructor 1
    MyClass() {
        // Calling another constructor in the same class using this()
        this(10, 20);
        System.out.println("Default Constructor called");
    }
    // Constructor 2
    MyClass(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parameterized Constructor called");
    }
    // Method to print x and y
    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();  // This will print the values of x and y
    }
}
