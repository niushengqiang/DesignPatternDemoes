package bridge.demo1;

public class IPhone extends  Phone {

    public IPhone(PhoneSoftWare software) {
        super(software);
    }

    @Override
    public void execSoft(){
        System.out.println("我是苹果手机");
        super.execSoft();
    }
}
