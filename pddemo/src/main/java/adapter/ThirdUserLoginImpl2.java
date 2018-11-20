package adapter;

/**
 * 这里采用注入属性的方式对原来的实现方式进行拓展.实现适配器模式并不改变原来的实现类的破坏
 */
public class ThirdUserLoginImpl2 implements IThirdServiceLogin{

    private  UserLoginImpl userlogin;

    public ThirdUserLoginImpl2(UserLoginImpl userlogin){
        this.userlogin=userlogin;
    }


    @Override
    public void login(String usernamme, String password) {

        this.userlogin.login(usernamme,password);
    }

    @Override
    public void register() {

        this.userlogin.register();
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
