package poly;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
    public static void main(String[] args) {
        /*SamsungTV tv = new SamsungTV();
        tv.powerON();
        tv.powerOFF();
        tv.volumeUP();
        tv.volumeDOWN();
        System.out.println("------------------");
        LGTV tv1 = new LGTV();
        tv1.powerON();
        tv1.powerOFF();
        tv1.volumeUP();
        tv1.volumeDOWN();
        System.out.println("------------------");*/

        // 스프링 컨테이너 구동
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("applicationContext.xml");

        TV tv = (TV) factory.getBean("tv"); //스프링 컨테이너로부터 객체 호출
        tv.powerON();
        tv.powerOFF();
        tv.volumeUP();
        tv.volumeDOWN();


        factory.close(); //스프링 컨테이너 종료
    }
}