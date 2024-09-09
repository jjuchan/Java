package cond.ex;

import java.util.Scanner;

public class RatingEx {
    public static void main(String[] args) {
        double rating = 9.8;
//        Scanner sc =new Scanner(System.in); 스캐너를 사용하여 수를 입력받아서 평점 찾기
//        int rating = sc.nextInt();
//
        if (rating >= 9) {
            System.out.println("어바웃타임");
        }if (rating >= 8) {
            System.out.println("toystory");
        }
        if (rating >= 7) {
            System.out.println("고질라");
        }
    }
}
