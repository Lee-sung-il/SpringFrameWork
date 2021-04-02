package poly;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {
    public AppleSpeaker() {
        System.out.println("===>Apple Speaker 객체생성");
    }

    @Override
    public void volumeUP() {
        System.out.println("Apple Speaker ====> 사운드 올림");
    }

    @Override
    public void volumeDOWN() {
        System.out.println("Apple Speaker ====> 사운드 내림");
    }
}
