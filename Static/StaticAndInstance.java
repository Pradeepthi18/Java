public class StaticAndInstance {
    // Static variable
    static int staticVar = 10;
    // Instance variable
    int instanceVar = 20;
    // Instance method
    public void printInstanceVariable() {
        System.out.println("Instance variable: " + instanceVar);
    }
    public static void main(String[] args) {
        System.out.println("Static variable: " + StaticAndInstance.staticVar);
       StaticAndInstance myObject = new StaticAndInstance();
        System.out.println("Instance variable: " + myObject.instanceVar);
        myObject.printInstanceVariable();
    }
}
