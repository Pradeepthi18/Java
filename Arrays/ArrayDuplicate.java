import java.util.ArrayList;
import java.util.HashSet;
public class ArrayDuplicate {
    public static ArrayList<Integer> findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num); 
            }
        }
        return duplicates; 
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 3, 6, 7, 8, 2};
        ArrayList<Integer> duplicates = findDuplicates(array);
        System.out.println("Duplicate values: " + duplicates);
    }
}
