public class EqualAndNotEqual {
    public static void main(String[] args) {
        System.out.println("Using == operator:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i is equal to 3");
            } else {
                System.out.println("i is not 3, current value: " + i);
            }
        }
        System.out.println("\nUsing != operator:");
        for (int i = 1; i <= 5; i++) {
            if (i != 3) {
                System.out.println("i is not 3, current value: " + i);
            } else {
                System.out.println("i is equal to 3");
            }
        }
    }
}