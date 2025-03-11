public class SecondLargest {
    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;  
                largest = num;            
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;     
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            int secondLargest = findSecondLargest(array);
            System.out.println("The second largest number is: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

