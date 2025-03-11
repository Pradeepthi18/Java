class A {
    int x = 10;
}

class B extends A {
    int y= 20;
}

class C extends B {
    int z = 30;
}

public class Main4{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        A obj4 = new C(); // Superclass reference pointing to a subclass object

        System.out.println("A reference, A object: " + obj1.x); // 10
        System.out.println("B reference, B object: " + obj2.y); // 20
        System.out.println("C reference, C object: " + obj3.z); // 30
        System.out.println("A reference, C object: " + obj4.x); // 10 (Not 30!)
    }
}