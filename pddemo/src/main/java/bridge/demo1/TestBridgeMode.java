package bridge.demo1;

public class TestBridgeMode {

    public static void main(String[] args){
        PhoneSoftWare qqGame = new QQGame();
        PhoneSoftWare weChat = new WeChat();


        HuaWei huaWei = new HuaWei(qqGame);
        huaWei.execSoft();

        HuaWei huaWei2 = new HuaWei(weChat);
        huaWei2.execSoft();

        IPhone iPhone = new IPhone(qqGame);
        iPhone.execSoft();

        IPhone iPhone2 = new IPhone(weChat);
        iPhone2.execSoft();

    }
}
