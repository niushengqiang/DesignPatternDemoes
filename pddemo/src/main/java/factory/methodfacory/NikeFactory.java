package factory.methodfacory;


import factory.Nike;
import factory.Tshirt;

public class NikeFactory implements ISOFactory{

    public Tshirt getShirt() {
        //这里省略若干制造的流水线
        return new Nike();
    }
}
