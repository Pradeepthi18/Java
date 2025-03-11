import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in))
        {
        double[] numbers = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        double largest = numbers[0];  
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
}