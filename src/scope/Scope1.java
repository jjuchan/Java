package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x는 생존 오류
        System.out.println("Main m =" + m);
//        System.out.println("Main x =" + x);
    } // m 종료
}
