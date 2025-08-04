package basic.access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
        if (max <= 0) {
            System.out.println("최댓값은 0보다 커야 한다");
        }
    }

    public void increment() {
        if (count < max) {
            count++;
        } else {
            System.out.println("최댓값을 넘을 수 없다 " + max);
        }
    }

    public int getCount() {
        return count;
    }
}
