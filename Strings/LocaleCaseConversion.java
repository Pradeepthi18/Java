import java.util.Locale;

public class LocaleCaseConversion{
    public static void main(String[] args) {
        String str = "hello world!";
        
        // Convert to uppercase using Locale
        String upperStr = str.toUpperCase(Locale.UK);
        System.out.println("Uppercase (Locale UK): " + upperStr);  // Output: HELLO WORLD!

        // Convert to lowercase using Locale
        String lowerStr = str.toLowerCase(Locale.GERMANY);
        System.out.println("Lowercase (Locale Germany): " + lowerStr);  // Output: hello world!
    }
}