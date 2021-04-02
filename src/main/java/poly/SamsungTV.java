package poly;

public class SamsungTV implements TV {
    private Speaker speaker;

    public SamsungTV() {
        System.out.println("=======> SamsungTV1 객체 생성");
    }

    public SamsungTV(Speaker speaker) {
        System.out.println("=======> SamsungTV2 객체 생성");
        this.speaker = speaker;
    }

    public void powerON() {
        System.out.println("SamsungTV =====> PowerOn");
    }

    public void powerOFF() {
        System.out.println("SamsungTV =====> PowerOFF");
    }

    public void volumeUP() {
        speaker.volumeUP();
        System.out.println("SamsungTV =====> VolumeUP");
    }

    public void volumeDOWN() {
        speaker.volumeDOWN();
        System.out.println("SamsungTV =====> VolumeDown");
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

}