package basic.access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment(); // This should not increment beyond max
        int count = counter.getCount();
        System.out.println("Current count: " + count); // Should print "Current count:
    }
}
