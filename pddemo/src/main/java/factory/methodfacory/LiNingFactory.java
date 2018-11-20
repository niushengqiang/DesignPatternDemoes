package factory.methodfacory;


import factory.LiNing;
import factory.Tshirt;

public class LiNingFactory implements  ISOFactory {

    public Tshirt getShirt() {
        return new LiNing();
    }
}
