package basic.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

        staticValue++; // 정적 변수 접근
        staticmethod(); // 정적 메서드 호출

    }

    public void instanceCall() {

        instanceValue++; // 인스턴스 변수 접근
        staticValue++; // 정적 변수 접근

    }

    private static void staticmethod() {
        // 정적 메서드에서는 인스턴스 변수에 접근할 수 없음
        // instanceValue++; // 컴파일 오류
        staticValue++; // 정적 변수 접근
    }
}
