class Example {
    // Method 1: takes an integer and returns an integer
    public int getValue(int number) {
        return number * 2;
    }

    // Method 2: takes a double and returns a double
    public double getValue(double number) {
        return number * 2.5;
    }

    public static void main(String[] args) {
        Example example = new Example();
        
        // Calling the method with an integer
        int intResult = example.getValue(5);
        System.out.println("Result from int method: " + intResult);
        
        // Calling the method with a double
        double doubleResult = example.getValue(5.5);
        System.out.println("Result from double method: " + doubleResult);
    }
}