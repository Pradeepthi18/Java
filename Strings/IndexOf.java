public class IndexOf{
    public static void main(String[] args) {
        // Declare a string
        String str = "Hello, World!";

        // Search for a character 'o'
        int indexChar = str.indexOf('o');
        System.out.println("First occurrence of 'o': " + indexChar);  // Output: 4

        // Search for a substring "World"
        int indexSubstring = str.indexOf("World");
        System.out.println("First occurrence of 'World': " + indexSubstring);  // Output: 7

        // Search for a substring starting from index 5
        int indexFrom = str.indexOf("o", 5);
        System.out.println("First occurrence of 'o' after index 5: " + indexFrom);  // Output: 8

        // Search for a non-existent character
        int indexNonExistent = str.indexOf('z');
        System.out.println("First occurrence of 'z': " + indexNonExistent);  // Output: -1
    }
}