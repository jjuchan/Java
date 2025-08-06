package basic.extends1.super1;

public class Child extends Parent {

    public String value = "자식 클래스의 값";

    @Override
    public void hello() {
        System.out.println("자식 클래스의 hello 메소드");
    }

    public void call() {
        System.out.println("value = " + this.value);
        System.out.println("value = " + super.value);
    }


}
