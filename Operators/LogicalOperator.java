public class LogicalOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND (&&) Operations:");
        System.out.println("a && b: " + (a && b)); 
        System.out.println("true && true: " + (true && true)); 
        System.out.println("false && false: " + (false && false));
        System.out.println();
        System.out.println("Logical OR (||) Operations:");
        System.out.println("a || b: " + (a || b)); 
        System.out.println("true || false: " + (true || false)); 
        System.out.println("false || false: " + (false || false)); 
        System.out.println(); 
        System.out.println("Logical NOT (!) Operations:");
        System.out.println("!a: " + (!a)); 
        System.out.println("!b: " + (!b)); 
        System.out.println("!(true && false): " + !(true && false)); 
    }
}