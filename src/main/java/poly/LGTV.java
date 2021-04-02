package poly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("tv")
public class LGTV implements TV {
    @Autowired
    private Speaker speaker;
    public LGTV() {
        System.out.println("=======> LGTV 객체 생성");
    }

    public void powerON() {
        System.out.println("LGTV =====> PowerOn");
    }

    public void powerOFF() {
        System.out.println("LGTV =====> PowerOFF");
    }

    @Override
    public void volumeUP() {
        speaker.volumeUP();
    }

    @Override
    public void volumeDOWN() {
        speaker.volumeDOWN();
    }
}