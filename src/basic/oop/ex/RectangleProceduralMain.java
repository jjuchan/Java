package basic.oop.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        int area = rectangle.calculateArea();
        System.out.println("area = " + area);
        int calculatePermeter = rectangle.calculatePermeter();
        System.out.println("calculatePermeter = " + calculatePermeter);
        boolean square = rectangle.isSquare();
        System.out.println("square = " + square);
    }
}
