public class InstanceMethod {
    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }
    // Static method
    public static void staticMethod() {
       InstanceMethod obj = new InstanceMethod();
        obj.instanceMethod();
    }
    public static void main(String[] args) {
        staticMethod();
    }
}
