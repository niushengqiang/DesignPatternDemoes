package proxy.jdkversion;

/**
 * @author yurang
 * @create --
 */
public class YuRang implements ITWorker{

    @Override
    public void coding() {
        System.out.println("我会写java代码");

    }

    @Override
    public void eating() {
        System.out.println("我爱吃素食");

    }
    @Override
    public void sleep() {
        System.out.println("我每天睡6个小时");
    }
}
