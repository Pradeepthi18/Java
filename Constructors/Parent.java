class Parent {
    private String name;

    // Default constructor
    public Parent() {
        System.out.println("Parent default constructor called");
        this.name = "Default Parent";
    }

    // Argument constructor
    public Parent(String name) {
        System.out.println("Parent argument constructor called with name: " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Child extends Parent {
    final int age;

    // Child default constructor
    public Child() {
        super();  // Calls Parent's default constructor
        System.out.println("Child default constructor called");
        this.age = 0;
    }

    // Child constructor with one argument
    public Child(String name) {
        super(name);  // Calls Parent's argument constructor with the given name
        System.out.println("Child argument constructor called with name: " + name);
        this.age = 0;
    }

    // Child constructor with two arguments
    public Child(String name, int age) {
        super(name);  // Calls Parent's argument constructor with the given name
        System.out.println("Child argument constructor called with name: " + name + " and age: " + age);
        this.age = age;
    }

    // Getter method to access the 'age' variable
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Calls Parent's default constructor, then Child's default constructor
        Child child1 = new Child();  
        System.out.println("Child 1 name: " + child1.getName());
        System.out.println("Child 1 age: " + child1.getAge());
        System.out.println();

        // Calls Parent's argument constructor, then Child's constructor with one argument
        Child child2 = new Child("ChildName");
        System.out.println("Child 2 name: " + child2.getName());
        System.out.println("Child 2 age: " + child2.getAge());
        System.out.println();

        // Calls Parent's argument constructor, then Child's constructor with two arguments
        Child child3 = new Child("AnotherChild", 10);
        System.out.println("Child 3 name: " + child3.getName());
        System.out.println("Child 3 age: " + child3.getAge());
    }
}
