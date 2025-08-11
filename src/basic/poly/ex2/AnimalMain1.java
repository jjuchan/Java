package basic.poly.ex2;

public class AnimalMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = {dog, cat, caw};
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal) {
        System.out.println("동물 소리:");
        animal.sound();
        System.out.println("끝");
    }

}
