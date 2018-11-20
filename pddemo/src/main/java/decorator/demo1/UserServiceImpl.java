package decorator.demo1;

public class UserServiceImpl implements IUservice{

    @Override
    public void login(String username, String password) {
        System.out.println("实现普通的登录");
    }

    @Override
    public void registory() {
        System.out.println("实现普通的登录");
    }
}
