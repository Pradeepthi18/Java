public class StaticAndInstanceMethods{
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }
    public static void main(String[] args) {
       StaticAndInstanceMethods.staticMethod();  
       StaticAndInstanceMethods myObject = new StaticAndInstanceMethods();
        myObject.staticMethod();  
        myObject.instanceMethod(); 
    }
}
