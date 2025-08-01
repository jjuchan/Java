package basic.construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("Jpa 프로그래밍", "KiM", 700);
        book3.displayInfo();
    }
}
