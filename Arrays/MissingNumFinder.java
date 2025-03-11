public class MissingNumFinder {
    public static int findMissingNumber(int[] arr) {
        int n = 100;  
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;  // Missing number
    }
    public static void main(String[] args) {
        int[] arr = new int[99]; 
        int missingNumber = 45;  
        for (int i = 0, j = 1; j <= 100; j++) {
            if (j == missingNumber) continue;
            arr[i++] = j;
        }
        System.out.println("Missing Number: " + findMissingNumber(arr));
    }
}

