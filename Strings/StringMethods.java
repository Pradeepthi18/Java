public class StringMethods {
    public static void main(String[] args) {
        // Declare some strings for testing
        String str1 = "Hello, World!";
        String str2 = "HELLO, WORLD!";
        String str4 = "Hello";
        String str5 = "apple";
        String str6 = "banana";
        String str7 = "hello, world!";

        // 1. Using equalsIgnoreCase() - Case-insensitive comparison
        System.out.println("1. equalsIgnoreCase() Example:");
        System.out.println("str1 equals str2 (ignore case): " + str1.equalsIgnoreCase(str2));  // Output: true
        System.out.println();

        // 2. Using startsWith() - Check if string starts with a prefix
        System.out.println("2. startsWith() Example:");
        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));  // Output: true
        System.out.println("str1 starts with 'World': " + str1.startsWith("World"));  // Output: false
        System.out.println();

        // 3. Using endsWith() - Check if string ends with a suffix
        System.out.println("3. endsWith() Example:");
        System.out.println("str1 ends with 'World!': " + str1.endsWith("World!"));  // Output: true
        System.out.println("str1 ends with 'Hello': " + str1.endsWith("Hello"));  // Output: false
        System.out.println();

        // 4. Using compareTo() - Compare strings lexicographically
        System.out.println("4. compareTo() Example:");
        System.out.println("Compare str5 and str6 (apple vs banana): " + str5.compareTo(str6));  // Output: Negative value (apple < banana)
        System.out.println("Compare str5 and str4 (apple vs Hello): " + str5.compareTo(str4));  // Output: Positive value (apple > Hello)
        System.out.println("Compare str1 and str7 (Hello, World! vs hello, world!): " + str1.compareTo(str7));  // Output: Negative value (Hello < hello)
        System.out.println();

        // 5. Additional Example to show equality
        System.out.println("5. Demonstrating equality with equalsIgnoreCase()");
        System.out.println("str4 equalsIgnoreCase 'HELLO': " + str4.equalsIgnoreCase("HELLO"));  // Output: true
        System.out.println("str4 equals 'hello': " + str4.equals("hello"));  // Output: false
    }
}