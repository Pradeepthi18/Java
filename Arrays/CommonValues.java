import java.util.ArrayList;
import java.util.HashSet;
public class CommonValues {
    public static ArrayList<Integer> findCommonValues(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> commonValues = new ArrayList<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            if (set.contains(num)) {
                commonValues.add(num); 
                set.remove(num); 
            }
        }
        return commonValues; 
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        ArrayList<Integer> commonValues = findCommonValues(array1, array2);
        System.out.println("Common values: " + commonValues);
    }
}
