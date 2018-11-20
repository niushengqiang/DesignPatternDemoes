package factory.abstractFactory;


import factory.LiNing;
import factory.Nike;

/**
 * 这是一个抽象工厂
 * 抽象工程对于生产产品的公共部分进行抽象,提取出公共的部分
 *
 */
public abstract class AbstractoryFactory {

    void prepare(){
        System.out.println("这是生产 耐克和李宁必须的提前准备");
    }
    abstract Nike getNike();
    abstract LiNing getLiNing();
}
