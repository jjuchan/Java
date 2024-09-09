package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int stuedent = sc.nextInt();
        int[][] scores = new int[stuedent][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < stuedent; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + "점수");
                scores[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < stuedent; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평군:" + average);
        }
    }
}
