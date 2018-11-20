package observer.demo2.business;

public class BusinessImpl implements IBusinessInterface {


    @Override
    public void login(String username, String password) {
        System.out.println("执行了真正的登录操作");
    }

    @Override
    public void register() {
        System.out.println("执行完真正的注册操作");
    }
}
