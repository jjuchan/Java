package basic.poly.ex6;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개가 달립니다.");
    }

    public void fetch() {
        System.out.println("개가 공을 가져옵니다.");
    }
}
