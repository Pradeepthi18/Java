import java.util.HashSet;
public class RemoveDuplicates {
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
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] noDuplicates = removeDuplicates(array);
        System.out.println("Array without duplicates:");
        for (int num : noDuplicates) {
            System.out.print(num + " ");
        }
    }
}
