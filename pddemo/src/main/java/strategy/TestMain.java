package strategy;

public class TestMain {
    public static void main(String[] args) {
        TourPal tourPal = new TourPal("张三", GoType.AIR.getHow2());
        tourPal.goTravel();
}
}
