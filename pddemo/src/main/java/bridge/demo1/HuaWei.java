package bridge.demo1;

public class HuaWei extends  Phone{

    public HuaWei(PhoneSoftWare software) {
        super(software);
    }
    @Override
    public void execSoft(){
        System.out.println("我是华为手机");
        super.execSoft();
    }
}
