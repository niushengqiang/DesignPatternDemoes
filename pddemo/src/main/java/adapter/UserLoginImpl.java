package adapter;

public class UserLoginImpl implements UserLogin{

    @Override
    public void login(String username, String password) {
        System.out.println("这里进行登录的认证");
    }

    @Override
    public void register() {
        System.out.println("这里进行注册的校验");
    }
}
