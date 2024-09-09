package Ioop;

public class While2_1 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        while (count < 3) {
            sum += count;
            count++;
            System.out.println(sum);
        }

    }
}
