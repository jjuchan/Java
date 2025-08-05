package basic.static2.ex;

public class Car {
    private String name;
    private static int totalCars;

    public Car(String name) {
        System.out.println("Car 생성자 호출: " + name);
        totalCars++;
        this.name = name;
    }

    public static void showTotalCars() {
        System.out.println("총 자동차 수: " + totalCars);

    }
}
