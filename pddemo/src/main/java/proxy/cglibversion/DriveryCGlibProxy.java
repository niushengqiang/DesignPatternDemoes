package proxy.cglibversion;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yurang
 * cglibproxy
 */
public class DriveryCGlibProxy  implements MethodInterceptor {

    //通过Enhancer 创建代理对象
    private Enhancer enhancer = new Enhancer();

    //通过Class对象获取代理对象
    public Object getProxy(Class c){
        enhancer.setSuperclass(c);  //代理类实际是 真是类的子类
        enhancer.setCallback(this); //回调类是当前类
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理执行开始");
        methodProxy.invokeSuper(o, objects);
        System.out.println("代理执行结束");
        return null;
    }

}
