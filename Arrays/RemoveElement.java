import java.util.Arrays;
public class RemoveElement {
    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num != value) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != value) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3};
        int target = 3;
        int[] result = removeElement(numbers, target);
        System.out.println("Array after removal: " + Arrays.toString(result));
    }
}