public class ArrayInsert {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int elementToInsert = 3;
        int position = 2; // Position to insert the element (after the second element)

        // Create a new array to hold the result
        int[] newArray = new int[array.length + 1];

        // Copy the elements before the position
        System.arraycopy(array, 0, newArray, 0, position);

        // Insert the new element
        newArray[position] = elementToInsert;

        // Copy the remaining elements after the position
        System.arraycopy(array, position, newArray, position + 1, array.length - position);

        // Print the new array
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
