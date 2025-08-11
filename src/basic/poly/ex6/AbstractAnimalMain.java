package basic.poly.ex6;

public class AbstractAnimalMain {
    public static void main(String[] args) {

        // 추상 클래스는 직접 인스턴스화할 수 없으므로,
        // 구체적인 서브클래스를 만들어야 합니다.
        AbstractAnimal dog = new Dog();
        dog.sound(); // 개가 짖습니다.
        dog.move();  // 동물이 이동합니다.

        Bird bird = new Bird();
        bird.sound(); // 새가 짹짹 소리를 냅니다.
        bird.fly();   // 새가 날아갑니다.
        bird.move();  // 새가 날아다닙니다.

    }
}
