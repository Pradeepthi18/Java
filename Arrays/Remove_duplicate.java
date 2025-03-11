import java.util.HashSet;
public class Remove_duplicate {
    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num); 
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result; 
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6};
        int[] uniqueArray = removeDuplicates(array);
        System.out.print("Array without duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
