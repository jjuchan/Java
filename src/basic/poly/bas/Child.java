package basic.poly.bas;

public class Child extends Parent {

    @Override
    public void parentMethod() {
        System.out.println("자식 클래스의 메소드입니다.");
    }

    public void childMethod() {
        System.out.println("자식 클래스의 추가 메소드입니다.");
    }
}
