class ScopeVariables {
    // Global variable (Instance variable)
    String message = "Global Variable";

    void display() {
        // Local variable with the same name
        String localMessage= "Local Variable";
        
        // Printing local variable
        System.out.println("Local Message: " + localMessage);
        
        // Printing global variable using 'this' keyword
        System.out.println("Global Message: " + this.message);
    }
    public static void main(String[] args) {
        ScopeVariables obj = new ScopeVariables();
        obj.display();
        }
}