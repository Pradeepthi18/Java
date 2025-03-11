public class MinMaxArray {
    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];  
            } 
            if (array[i] > max) {
                max = array[i];  
            }
        }
        return new int[] {min, max};
    }
    public static void main(String[] args) {
        int[] array = {5, 1, 9, 3, 7, 8};
        int[] result = findMinMax(array);
        System.out.println("Minimum Value: " + result[0]);
        System.out.println("Maximum Value: " + result[1]);
    }
}
