package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수를 입력하세요 :");
        int a = sc.nextInt();
        System.out.print("두번 째 수를 입력하세요");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("더 큰 수 :" + a);
        } else if (a < b) {
            System.out.println("더 큰 수 :" + b);
        } else {
            System.out.println("두 수가 같다");
        }
    }
}


