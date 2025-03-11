public class ValueOf {
    public static void main(String[] args) {
        // Converting int to String
        int num1 = 100;
        String str1 = String.valueOf(num1);
        System.out.println("Integer to String: " + str1);  // Output: "100"

        // Converting double to String
        double num2 = 99.99;
        String str2 = String.valueOf(num2);
        System.out.println("Double to String: " + str2);  // Output: "99.99"

        // Converting float to String
        float num3 = 10.5f;
        String str3 = String.valueOf(num3);
        System.out.println("Float to String: " + str3);  // Output: "10.5"

        // Converting long to String
        long num4 = 123456789L;
        String str4 = String.valueOf(num4);
        System.out.println("Long to String: " + str4);  // Output: "123456789"

        // Converting boolean to String
        boolean flag = true;
        String str5 = String.valueOf(flag);
        System.out.println("Boolean to String: " + str5);  // Output: "true"

        // Converting char to String
        char character = 'A';
        String str6 = String.valueOf(character);
        System.out.println("Char to String: " + str6);  // Output: "A"
    }
}