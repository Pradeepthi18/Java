import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StringExample {
    public static void main(String[] args) {
        // 1. Using String Literal
        String str1 = "Hello, World!";
        System.out.println("String using literal: " + str1);
        // 2. Using the new Keyword (String Constructor)
        String str2 = new String("Hello, World!");
        System.out.println("String using new keyword: " + str2);
        // 3. Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World!");
        String str3 = sb.toString();
        System.out.println("String using StringBuilder: " + str3);
        // 4. Using String.format()
        String str4 = String.format("Hello, %s!", "Java");
        System.out.println("String using String.format(): " + str4);
        // 5. Using String.concat()
        String str5 = "Hello, ".concat("World!");
        System.out.println("String using concat(): " + str5);
        // 6. Using + Operator
        String str6 = "Hello" + ", " + "World!";
        System.out.println("String using + operator: " + str6);
        // 7. Using Character.toString()
        char c = 'A';
        String str7 = Character.toString(c);
        System.out.println("String using Character.toString(): " + str7);
        // 8. Using String.valueOf()
        int num = 123;
        String str8 = String.valueOf(num);
        System.out.println("String using String.valueOf(): " + str8);
        // 9. Using Arrays.toString() on char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str9 = Arrays.toString(charArray);  // Output: "[H, e, l, l, o]"
        System.out.println("String using Arrays.toString() on char array: " + str9);
        // 10. Using String.join()
        String str10 = String.join(", ", "Hello", "World", "Java");
        System.out.println("String using String.join(): " + str10);
        // 11. Using Stream.collect() to join a list of strings
        List<String> list = Arrays.asList("Hello", "World", "Java");
        String str11 = list.stream().collect(Collectors.joining(" "));
        System.out.println("String using Stream.collect(): " + str11);
        // 12. Modifying a String using StringBuffer (similar to StringBuilder)
        StringBuffer sbf = new StringBuffer();
        sbf.append("Java");
        sbf.append(" Programming!");
        String str12 = sbf.toString();
        System.out.println("String using StringBuffer: " + str12);
    }
}