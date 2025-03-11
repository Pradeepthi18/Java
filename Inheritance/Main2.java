// Superclass A
class A {
    // Method specific to class A
    public void methodA1() {
        System.out.println("Method A1 in class A");
    }
    public void methodA2() {
        System.out.println("Method A2 in class A");
    }
    public void overriddenMethod() {
        System.out.println("Overridden method in class A");
    }
}

// Subclass B inherits from A
class B extends A {
    public void methodB1() {
        System.out.println("Method B1 in class B");
    }
    public void methodB2() {
        System.out.println("Method B2 in class B");
    }
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class B");
    }
}

// Subclass C inherits from B
class C extends B {
    public void methodC1() {
        System.out.println("Method C1 in class C");
    }
    public void methodC2() {
        System.out.println("Method C2 in class C");
    }
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class C");
    }
}

public class Main2 {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println("Calling methods in class A:");
        objA.methodA1();
        objA.methodA2();
        objA.overriddenMethod();

        B objB = new B();
        System.out.println("\nCalling methods in class B:");
        objB.methodA1(); 
        objB.methodA2(); 
        objB.methodB1();
        objB.methodB2();
        objB.overriddenMethod(); 

        C objC = new C();
        System.out.println("\nCalling methods in class C:");
        objC.methodA1(); 
        objC.methodA2(); 
        objC.methodB1(); 
        objC.methodB2(); 
        objC.methodC1();
        objC.methodC2();
        objC.overriddenMethod(); 
    }
}
