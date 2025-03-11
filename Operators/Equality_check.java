import java.util.Scanner;
public class Equality_check {       
     public static void main(String[] args) {
           try(Scanner sc=new Scanner(System.in))
           {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            if (num1 == num2) {
                System.out.println("The numbers are equal.");
            } else {
                System.out.println("The numbers are not equal.");
            }
            sc.close();
        }
    }
}
