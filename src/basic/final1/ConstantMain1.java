package basic.final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int maxParticipants = 1000; // 상수로 사용될 변수
    }

    private static void process(int maxParticipants) {
        // 이 메서드는 최대 참여자 수를 처리하는 로직을 포함할 수 있습니다.
        System.out.println("최대 참여자 수: " + maxParticipants);
    }
}
