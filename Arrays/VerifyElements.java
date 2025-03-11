public class VerifyElements {
    public static boolean containsElements(int[] array, int element1, int element2) {
        if (array == null || array.length == 0) {
            return false;
        }
        boolean foundElement1 = false;
        boolean foundElement2 = false;
        for (int num : array) {
            if (num == element1) {
                foundElement1 = true;
            } else if (num == element2) {
                foundElement2 = true;
            }
            if (foundElement1 && foundElement2) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 12, 23, 7, 3};
        boolean result = containsElements(array, 12, 23);
        if (result) {
            System.out.println("The array contains both 12 and 23.");
        } else {
            System.out.println("The array does not contain both 12 and 23.");
        }
    }
}
