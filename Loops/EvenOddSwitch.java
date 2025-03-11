import java.util.Scanner;
public class EvenOddSwitch {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        switch (num % 2) {
            case 0 -> System.out.println(num + " is an Even number.");
            default -> System.out.println(num + " is an Odd number.");
        }
    }
}
}