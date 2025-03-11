public class Trim {
    public static void main(String[] args) {
        // Declare a string with leading and trailing spaces
        String str1 = "   Hello, World!   ";

        // Use trim() to remove leading and trailing spaces
        String trimmedStr = str1.trim();

        // Print the original and trimmed strings
        System.out.println("Original String: '" + str1 + "'");
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}