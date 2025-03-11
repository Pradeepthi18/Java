public class StringSplit {
    public static void main(String[] args) {
        // Example 1: Splitting using a space as delimiter
        String str1 = "Java is a popular programming language";
        String[] words = str1.split(" "); // Splitting by space
        System.out.println("Example 1: Splitting by space:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();

        // Example 2: Splitting using a comma as delimiter
        String str2 = "apple,banana,orange,grape";
        String[] fruits = str2.split(","); // Splitting by comma
        System.out.println("Example 2: Splitting by comma:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();

        // Example 3: Using regular expression to split by multiple spaces or commas
        String str3 = "Java   ,   Python   ,  C++  ";
        String[] languages = str3.split("[,\\s]+"); // Splitting by comma or space (one or more spaces)
        System.out.println("Example 3: Splitting by comma or space:");
        for (String language : languages) {
            System.out.println(language);
        }
        System.out.println();

    }
}