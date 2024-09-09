package Ioop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 20) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}
