import java.util.Scanner;
public class GenderSwitch {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter M or F: ");
            char gender = scanner.next().charAt(0);
            String result = switch (Character.toUpperCase(gender)) {
                case 'M' -> "Gender: Male";
                case 'F' -> "Gender: Female";
                default -> "Invalid input! Please enter M or F.";
            };
            System.out.println(result);
        } 
    }
}