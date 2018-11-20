package proxy.jdkversion;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author yurang
 */
public class ProxyTest {
    public static void main(String[] args) throws  Exception {
        YuRang yuRang = new YuRang();
        ITworkProxy iTworkProxy = new ITworkProxy(yuRang);
        ITWorker proxyInstance =iTworkProxy.getInstance();
        System.out.println("动态的生成代理类的是:"+proxyInstance.getClass());
        proxyInstance.coding();
        proxyInstance.eating();
        proxyInstance.sleep();

        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{ITWorker.class});
        FileOutputStream os = new FileOutputStream("D://$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}
