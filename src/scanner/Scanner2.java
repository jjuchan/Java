package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수를 입력하세요 :");
        int a = sc.nextInt();
        System.out.print("두번째 수를 입력하세요 :");
        int b = sc.nextInt();
        System.out.println("두 수의 합 : " + (a + b));
    }
}
