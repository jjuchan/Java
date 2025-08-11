package basic.poly.bas;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod(); // 부모 클래스의 메소드입니다.


        System.out.println("child -> child");
        Child child = new Child();
        child.parentMethod(); // 자식 클래스의 메소드입니다.
        child.childMethod(); // 자식 클래스의 추가 메소드입니다.

        //부모변수가 자식 인스턴스를 참조
        System.out.println("parent -> child");
        Parent parentChild = new Child();
        parentChild.parentMethod(); // 자식 클래스의 메소드입니다.

    }
}
