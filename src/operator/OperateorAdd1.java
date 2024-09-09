package operator;

public class OperateorAdd1 {
    public static void main(String[] args) {
        int a = 10;

        a = a + 1;
        System.out.println("a = " + a);

        a = a + 1;
        System.out.println("a = " + a);

        ++a; // a= a+1이랑 동일
        System.out.println("a = " + a);
    }
}
