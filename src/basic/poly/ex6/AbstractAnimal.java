package basic.poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound(); // 추상 메소드: 소리 내기

    public void move() { // 일반 메소드: 이동
        System.out.println("동물이 이동합니다.");
    }
}
