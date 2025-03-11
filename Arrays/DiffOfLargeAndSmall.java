public class DiffOfLargeAndSmall {
    public static int getDifference(int[] array) {
        // Handle edge case: if the array is empty or null
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element.");
        }
        int largest = array[0];
        int smallest = array[0];
        for (int num : array) {
            if (num > largest) {
                largest = num;  
            } 
            if (num < smallest) {
                smallest = num; 
            }
        }
        return largest - smallest;
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 2};
        try {
            int difference = getDifference(array);
            System.out.println("The difference between the largest and smallest values is: " + difference);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
