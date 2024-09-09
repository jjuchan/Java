package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("입력한 숫자 " + a + " 는 짝수 입니다.");
        } else {
            System.out.println("입력한 숫자 " + a + " 는 홀수 입니다.");
        }
    }
}
