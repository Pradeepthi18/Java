public class ArraySearch {
    public static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true; 
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        if (contains(numbers, target)) {
            System.out.println("Array contains " + target);
        } else {
            System.out.println("Array does not contain " + target);
        }
    }
}