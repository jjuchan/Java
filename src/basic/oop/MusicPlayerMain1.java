package basic.oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {

        MusicPlayerData musicPlayerData = new MusicPlayerData();

        on(musicPlayerData); // 음악 켜기

        //볼륨 증가
        up(musicPlayerData);

        //볼륨 증가
        up(musicPlayerData);

        //볼륨 감소
        down(musicPlayerData);

        //음악 플레이어 상태
        isOn(musicPlayerData);

        off(musicPlayerData); //음악 끄기

    }

    static void on(MusicPlayerData musicPlayerData) {
        //음악 플레이어 켜기
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어을 시작합니다.");

    }

    static void off(MusicPlayerData musicPlayerData) {
        //음악 플레이어 끄기
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }

    static void up(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume++;
        System.out.println("volume = " + musicPlayerData.volume);
    }

    static void down(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume--;
        System.out.println("volume = " + musicPlayerData.volume);
    }

    static void isOn(MusicPlayerData musicPlayerData) {
        System.out.println("isOn = " + musicPlayerData.isOn);
        if (musicPlayerData.isOn) {
            System.out.println("volume = " + musicPlayerData.volume);
        } else {
            System.out.println("음악 off");
        }
    }
}
