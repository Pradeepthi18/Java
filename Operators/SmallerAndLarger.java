import java.util.Scanner;
public class SmallerAndLarger {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in))
        {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int smaller = Math.min(num1, num2);
        int larger = Math.max(num1, num2);
        System.out.println("Smaller number: " + smaller);
        System.out.println("Larger number: " + larger);
        scanner.close();
    }
}
}