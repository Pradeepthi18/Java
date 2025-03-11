public class ExampleClass {
    static int staticVar1 = 10;
    static String staticVar2 = "Hello, Static!";
    int instanceVar1;
    String instanceVar2;
    public ExampleClass(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }
    public static void staticMethod1() {
        System.out.println("This is the first static method.");
        System.out.println("Static Variable 1: " + staticVar1);
    }
    public static void staticMethod2() {
        System.out.println("This is the second static method.");
        System.out.println("Static Variable 2: " + staticVar2);
    }
    public void instanceMethod1() {
        System.out.println("This is the first instance method.");
        System.out.println("Instance Variable 1: " + instanceVar1);
    }
    public void instanceMethod2() {
        System.out.println("This is the second instance method.");
        System.out.println("Instance Variable 2: " + instanceVar2);
    }
    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        staticMethod1();
        staticMethod2();
        ExampleClass obj = new ExampleClass(42, "Hello, Instance!");
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
