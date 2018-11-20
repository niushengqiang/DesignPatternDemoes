package strategy;

public class Car implements TOLiJiang{

    @Override
    public void goToLijiang(String name, long km) {
        System.out.println(name+"自驾去丽江需要行驶"+km+"km的道路");
    }
}
