package basic.static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("정적 호출");
        DecoData.staticCall();

        System.out.println("인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall();
    }
}
