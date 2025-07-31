package basic.oop;

public class MusicPlayerData {
    int volume = 0;
    boolean isOn = false;


    void on() {
        //음악 플레이어 켜기
        this.isOn = true;
        System.out.println("음악 플레이어을 시작합니다.");

    }

    void off() {
        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }

    void up() {
        volume++;
        System.out.println("volume = " + volume);
    }

    void down() {
        volume--;
        System.out.println("volume = " +volume);
    }

    void isOn() {
        System.out.println("isOn = " + isOn);
        if (isOn) {
            System.out.println("volume = " + volume);
        } else {
            System.out.println("음악 off");
        }
    }
}
