public class ArraySum {
    public static int sumArray(int[] arr) {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
        return sum; 
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; 
        int result = sumArray(numbers); 
        System.out.println("Sum of the array: " + result); 
    }
}