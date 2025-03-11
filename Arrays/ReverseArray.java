public class ReverseArray {
    public static void reverseArray(int[] array) {
        if (array == null || array.length <= 1) {
            return; 
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        reverseArray(array);
        System.out.println("\nReversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
