package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min, max;
        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
