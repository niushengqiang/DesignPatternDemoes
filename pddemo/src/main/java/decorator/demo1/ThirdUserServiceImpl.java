package decorator.demo1;

public class ThirdUserServiceImpl implements IThirdUserService{

    private IUservice uservice;

    public ThirdUserServiceImpl(IUservice uservice){
        this.uservice=uservice;
    }

    @Override
    public void qqLogin() {
        System.out.println("拓展了qq登录");
    }

    @Override
    public void weChatLogin() {

    }

    @Override
    public void phoneLogin() {

    }

    @Override
    public void login(String username, String password) {

    }

    @Override
    public void registory() {

    }
}
