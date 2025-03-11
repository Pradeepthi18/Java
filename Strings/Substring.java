public class Substring {
    public static void main(String[] args) {
        // Declare a string
        String str = "Hello, World!";

        // Extract substring starting from index 7 to the end
        String substr1 = str.substring(7);

        // Extract substring from index 0 to 5 (not including index 5)
        String substr2 = str.substring(0, 5);

        // Print the results
        System.out.println("Substring from index 7: " + substr1);  // Output: World!
        System.out.println("Substring from index 0 to 5: " + substr2);  // Output: Hello
    }
}