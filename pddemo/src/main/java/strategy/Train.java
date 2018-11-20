package strategy;

public class Train implements TOLiJiang{

    @Override
    public void goToLijiang(String name, long km) {
        System.out.println(name+"火车去丽江需要行驶"+km+"km的道路");
    }
}
