// Superclass A
class A {
    // Overridden method in class A
    public void overriddenMethod() {
        System.out.println("Overridden method in class A");
    }
}

// Subclass B inherits from A
class B extends A {
    // Overridden method in class B
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class B");
    }
}

// Subclass C inherits from B
class C extends B {
    // Overridden method in class C
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in class C");
    }
}

public class Main3 {
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();
        A referenceToB = new B();
        referenceToB.overriddenMethod(); 
        A referenceToC = new C();
        referenceToC.overriddenMethod(); 
        System.out.println("\nCalling methods directly on objB and objC:");
        objB.overriddenMethod(); 
        objC.overriddenMethod(); 
    }
}

