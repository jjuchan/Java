package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번재 숫자와 두번째 숫자 모두 0이면 끝");

        while (true) {
            System.out.print(" 첫번 째 수:");
            int a = sc.nextInt();
            System.out.print("두 번재 수:");
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            int sum = a + b;
            System.out.println(" 두 숫자의 합:" + sum);
        }
    }
}
