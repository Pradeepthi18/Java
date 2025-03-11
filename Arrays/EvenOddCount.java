public class EvenOddCount {
    public static int[] countEvenOdd(int[] array) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++;  
            }
        }
        return new int[]{evenCount, oddCount};
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = countEvenOdd(array);
        System.out.println("Even numbers: " + result[0]);
        System.out.println("Odd numbers: " + result[1]);
    }
}
