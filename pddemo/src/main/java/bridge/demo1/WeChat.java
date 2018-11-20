package bridge.demo1;

public class WeChat implements PhoneSoftWare{

    @Override
    public void exec() {
        System.out.println("微信运行中...");
    }
}
