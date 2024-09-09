package operator;

import java.sql.SQLOutput;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a+b = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multiply = a * b;
        System.out.println("a * b = " + multiply);

        //나눗셈

        int divide = a / b;
        System.out.println("a / b = " + divide);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
