package poly;

public class BranFactory {

    public Object getBean(String beanName) {
        if (beanName.equals("samsung")) {
            return new SamsungTV();
        }else if (beanName.equals("lg")) {
            return new LGTV();
        }
        return null;
    }
}
