package basic.poly.ex2;

public class AnimalMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
