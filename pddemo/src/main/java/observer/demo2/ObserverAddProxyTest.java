package observer.demo2;

import observer.demo2.business.BusinessImpl;
import observer.demo2.business.IBusinessInterface;
import observer.demo2.proxy.BusinessImplProxy;

import java.lang.reflect.Method;

/**
 * 这里使用的是监视者模式和代理模式的组合模式
 * 监视者模式:负责给监视目标对象的行为添加额外的操作
 * 代理模式: 代理原有的业务实现类让监视者通过代理模式嵌套到实际业务代码当中去
 */
public class ObserverAddProxyTest {
    public static void main(String[] args) throws Exception {

        //设定的事件 给事件监听器
        Class<Callback> callbackClass = Callback.class;
        Method callbackMethod = callbackClass.getMethod("execcallback", EventType.class);

        Event addEvent = new Event(EventType.ADD,callbackMethod,new Object[]{EventType.ADD},new Callback());
        Event removeEvent = new Event(EventType.REMOVE,callbackMethod,new Object[]{EventType.REMOVE},new Callback());
        Event editEvent = new Event(EventType.EDIT,callbackMethod,new Object[]{EventType.EDIT},new Callback());
        Event queryEvent = new Event(EventType.QUERY,callbackMethod,new Object[]{EventType.QUERY},new Callback());

        EventListener eventListener = new EventListener();
        eventListener.add(addEvent);
        eventListener.add(removeEvent);
        eventListener.add(editEvent);
        eventListener.add(queryEvent);

        //创建代理类
        BusinessImplProxy createProxy = new BusinessImplProxy(new BusinessImpl(), eventListener);
        IBusinessInterface proxyInstance = createProxy.getInstance();

        proxyInstance.login("123","23");
        proxyInstance.register();

    }
}
