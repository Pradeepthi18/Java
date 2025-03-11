public class StaticVariable {
    // Static variables
    static int staticVar1 = 20;
    static String staticVar2 = "Hello, Static!";
    // Instance method
    public void printStaticVariables() {
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }
    public static void main(String[] args) {
        // Creating an object of ExampleClass
        StaticVariable obj = new StaticVariable();
        obj.printStaticVariables();
    }
}
