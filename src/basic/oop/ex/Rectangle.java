package basic.oop.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    int calculateArea() {
        return width * height;
    }

    int calculatePermeter() {

        return (width + height) * 2;
    }

    boolean isSquare() {
        return width == height;
    }
}
