package basic.poly.ex3;


public class InterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        sound(cat);
        sound(dog);
        sound(caw);


    }
    private static void sound(InterfaceAnimal animal) {
        System.out.println("동물 소리:");
        animal.sound();
        System.out.println("끝");
    }
}
