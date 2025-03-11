public class Matches{
    public static void main(String[] args) {
        // Declare some strings to test
        String str1 = "hello123";
        String str2 = "Hello@123";
        String str3 = "12345";
        
        // Regular expression to match a string with only lowercase letters and digits
        String regex = "^[a-z0-9]+$";
        
        // Test if str1 matches the regex
        System.out.println("str1 matches: " + str1.matches(regex));  // Output: true

        // Test if str2 matches the regex
        System.out.println("str2 matches: " + str2.matches(regex));  // Output: false

        // Test if str3 matches the regex
        System.out.println("str3 matches: " + str3.matches(regex));  // Output: true
    }
}