public class ClassObjectMethod{
    public void bark() {
        System.out.println("Woof!");
    }
    public void eat() {
        System.out.println("Nom nom nom...");
    }
    public static void main(String[] args) {
        ClassObjectMethod obj = new ClassObjectMethod();
       obj.bark();
       obj.eat();
    }
}