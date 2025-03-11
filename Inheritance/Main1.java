// Superclass A
class A {
    // Specific method in class A
    public void methodA1() {
        System.out.println("Method A1 in class A");
    }
    // Specific method in class A
    public void methodA2() {
        System.out.println("Method A2 in class A");
    }
    // Overridden method in class A
    public void overriddenMethod() {
        System.out.println("Overridden method in class A");
    }
}
// Subclass B inherits from A
class B extends A {
    // Specific method in class B
    public void methodB1() {
        System.out.println("Method B1 in class B");
    }
    // Specific method in class B
    public void methodB2() {
        System.out.println("Method B2 in class B");
    }
    // Overridden method in class B (overrides A's method)
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class B");
    }
}
// Subclass C inherits from B
class C extends B {
    // Specific method in class C
    public void methodC1() {
        System.out.println("Method C1 in class C");
    }
    // Specific method in class C
    public void methodC2() {
        System.out.println("Method C2 in class C");
    }
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class C");
    }
}
public class Main1 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        System.out.println("Calling methods in class A:");
        objA.methodA1();
        objA.methodA2();
        objA.overriddenMethod();

        System.out.println("\nCalling methods in class B:");
        objB.methodB1();
        objB.methodB2();
        objB.overriddenMethod(); 

        System.out.println("\nCalling methods in class C:");
        objC.methodC1();
        objC.methodC2();
        objC.overriddenMethod();
    }
}
