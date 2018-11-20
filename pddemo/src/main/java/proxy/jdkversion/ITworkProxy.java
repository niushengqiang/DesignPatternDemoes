package proxy.jdkversion;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yurang
 * it工作的代理类
 * jdk中的动态代理是由 InvocationHandler接口和Proxy类来配合使用的
 *
 */
public class ITworkProxy  implements InvocationHandler{

    private ITWorker workTarget;

    public ITworkProxy(ITWorker workTarget) {
        this.workTarget = workTarget;
    }
    public ITworkProxy() {}

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("干活之前墨迹5分钟");
        Object invoke = method.invoke(workTarget, args);
        System.out.println("干活之后得以一会");
        return invoke;
    }

    //获取代理对象
    public  ITWorker getInstance(){
        ITWorker o=(ITWorker) Proxy.newProxyInstance(workTarget.getClass().getClassLoader(),
                workTarget.getClass().getInterfaces(),this);
        return o;
    }


}
