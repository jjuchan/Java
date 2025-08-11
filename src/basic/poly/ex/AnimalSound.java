package basic.poly.ex;

public class AnimalSound {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.sound(); // 멍멍
        cat.sound(); // 야옹
        caw.sound(); // 음메
    }
}
