package proxy.cglibversion;

import net.sf.cglib.proxy.Proxy;

/**
 * @author yurang
 */
public class CGLibProxyTest {
    public static void main(String[] args) {
        DriveryCGlibProxy glibProxy = new DriveryCGlibProxy();
        Driver driverProxy = (Driver)glibProxy.getProxy(Driver.class);
        driverProxy.drivering();
    }
}
