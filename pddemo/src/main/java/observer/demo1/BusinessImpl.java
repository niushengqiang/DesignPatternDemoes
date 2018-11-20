package observer.demo1;

import observer.demo1.entity.EventListener;
import observer.demo1.entity.EventType;

public class BusinessImpl implements IBusinessInterface{

    private EventListener el;

    public BusinessImpl(EventListener el) {
        this.el = el;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("执行了真正的登录操作");
        el.trigger(EventType.QUERY);
    }

    @Override
    public void register() {
        System.out.println("执行完真正的注册操作");
        el.trigger(EventType.ADD);
    }
}
