public class InstanceVariable {
    // Instance variables
    int instanceVar1 = 10;
    String instanceVar2 = "Hello, Instance!";
    public static void printInstanceVariables(InstanceVariable obj) {
        // Accessing instance variables using the object reference
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }
    public static void main(String[] args) {
        InstanceVariable obj= new InstanceVariable();
        printInstanceVariables(obj);
    }
}
