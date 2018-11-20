package decorator.demo1;

public class TestDecorator {
    public static void main(String[] args) {
        IUservice thirdUserService = new ThirdUserServiceImpl(new UserServiceImpl());
        thirdUserService.login("张三","123456");
    }
}
