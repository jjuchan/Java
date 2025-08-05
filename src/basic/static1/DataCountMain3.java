package basic.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("data1 = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("data2 = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("data3 = " + Data3.count);
    }
}
