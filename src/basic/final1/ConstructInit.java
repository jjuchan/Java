package basic.final1;

public class ConstructInit {
    final int value;

    public ConstructInit(int value) {
        this.value = value; // 생성자에서 final 변수 초기화
        System.out.println("ConstructInit 생성자 호출: value = " + value);
    }
}
