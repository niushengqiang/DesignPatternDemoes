package factory.abstractFactory;


import factory.LiNing;
import factory.Nike;

/**
 * 抽象工程被一个巨大的承包商去做
 */
public class BigContractor extends AbstractoryFactory {


    @Override
    public Nike getNike() {
        return new Nike();
    }

    @Override
    public LiNing getLiNing() {
        return new LiNing();
    }
}
