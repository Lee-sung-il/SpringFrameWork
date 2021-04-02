package poly;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
    public SonySpeaker() {
        System.out.println("===>Sony Speaker 객체생성");
    }

    @Override
    public void volumeUP() {
        System.out.println("Sony Speaker ====> 사운드 올림");
    }

    @Override
    public void volumeDOWN() {
        System.out.println("Sony Speaker ====> 사운드 내림");
    }
}
