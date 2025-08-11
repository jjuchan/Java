package basic.poly.bas;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 클래스 타입의 변수에 자식 클래스 인스턴스를 할당
        Parent parent = new Child();
        parent.parentMethod(); // 자식 클래스의 메소드입니다.
        // parent.childMethod(); // 컴파일 오류: Parent 클래스에는 childMethod가 없음

        // 자식 클래스 타입으로 캐스팅
        ((Child) parent).childMethod(); // 명시적 캐스팅 후 자식 클래스 메소드 호출


    }
}
