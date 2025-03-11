public class StaticMethod {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
    // Instance method
    public void instanceMethod() {
        staticMethod(); 
        StaticMethod.staticMethod(); 
    }

    public static void main(String[] args) {
       StaticMethod myObject = new StaticMethod();
        myObject.instanceMethod(); 
    }
}
