package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 첫 번째 숫자를 입력하세요:");
        int a = sc.nextInt();
        System.out.print(" 두 번재 숫자를 입력하세요:");
        int b = sc.nextInt();

        if (a > b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("두 숫자 사이의 모든 정수:");
        for (int i = a; i <= b; i++) {
            System.out.print(i);
            if (i != b) {
                System.out.print(",");
            }
        }
    }
}
