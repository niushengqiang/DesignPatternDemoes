package strategy;

public class TourPal {

    private  String name;



    private  TOLiJiang toLiJiang;

    public TourPal(String name, TOLiJiang toLiJiang) {
        this.name = name;
        this.toLiJiang = toLiJiang;
    }

    public void goTravel(){
        toLiJiang.goToLijiang(name ,20);
    }


}
