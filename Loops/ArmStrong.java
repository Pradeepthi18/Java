import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        int originalNum = num, sum = 0, digits = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        }
    }

}