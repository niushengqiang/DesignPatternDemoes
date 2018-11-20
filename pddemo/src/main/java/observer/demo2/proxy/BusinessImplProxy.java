package observer.demo2.proxy;

import observer.demo2.EventListener;
import observer.demo2.EventType;
import observer.demo2.business.IBusinessInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式经常和观察者模式配合使用.
 * 代理中调用观察者的方法.使得观察的方法和实际业务执行的方法分离
 */
public class BusinessImplProxy implements InvocationHandler{

    private IBusinessInterface business;
    private EventListener listener;

    public BusinessImplProxy(IBusinessInterface business, EventListener listener) {
        this.business = business;
        this.listener = listener;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //执行实际业务代码
        Object invoke = method.invoke(business, args);

        //执行监视者的代码
        String name = method.getName();
        if("login".equals(name)){
            listener.trigger(EventType.QUERY);
        }else if("register".equals(name)){
            listener.trigger(EventType.ADD);
        }else{
            System.out.println("这里没有触发监视者");
        }
        return invoke;
    }

    public IBusinessInterface getInstance(){
        IBusinessInterface b = (IBusinessInterface)Proxy.newProxyInstance(business.getClass().getClassLoader(),
                business.getClass().getInterfaces(), this);
        return b;
    }

}
