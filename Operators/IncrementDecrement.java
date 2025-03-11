class IncrementDecrement{
    private int value;
    public IncrementDecrement(int value) {
        this.value = value;
    }
    public void increment() {
        value++;
    }
    public void decrement() {
        value--;
    }
    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Counter value: " + value;
    }

    public static void main(String[] args) {
        IncrementDecrement counter = new IncrementDecrement(5);
        System.out.println(counter); 
        counter.increment();
        System.out.println(counter); 
        counter.decrement();
        System.out.println(counter); 
    }
}