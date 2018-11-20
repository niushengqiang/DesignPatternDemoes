package strategy;

public class Aircraft implements TOLiJiang{

    @Override
    public void goToLijiang(String name, long km) {
        System.out.println(name+"飞机去丽江需要行驶"+km+"km的道路");
    }
}

