package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 객수:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;
        System.out.println(count+"정수를 입력하세요:");
        for(int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();

        }
        average = (double) sum/ count;
        System.out.println("입력한 정수의 합계:" + sum);
        System.out.println("입력한 정수의 평균:" +average);
    }
}
