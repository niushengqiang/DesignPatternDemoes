package adapter;

/**
 * 这里采用继承的方式对原来的实现方式进行拓展
 */
public class ThirdUserLoginImpl  extends UserLoginImpl implements IThirdServiceLogin{

    @Override
    public void login(String usernamme, String password) {
        super.login(usernamme,password);
    }

    @Override
    public void register() {
        super.register();
    }

    @Override
    public void qqLogin() {
        System.out.println("扩展的QQ登录");

    }

    @Override
    public void weChatLogin() {
        System.out.println("扩展的微信登录");
    }

    @Override
    public void phoneLogin() {
        System.out.println("扩展的手机登录");
    }
}
