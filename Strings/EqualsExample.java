public class EqualsExample {
    public static void main(String[] args) {
        // Declare some strings
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = "Hello";

        // Comparing str1 and str2 (both are "Hello")
        System.out.println("str1 equals str2: " + str1.equals(str2));  // Output: true

        // Comparing str1 and str3 (case-sensitive comparison)
        System.out.println("str1 equals str3: " + str1.equals(str3));  // Output: false

        // Comparing str1 and str4 (they have the same content)
        System.out.println("str1 equals str4: " + str1.equals(str4));  // Output: true
    }
}