package mediator.demo2;

public class LiSi implements Employee {

    @Override
    public void speak(String message) {
        System.out.println("");
    }

    @Override
    public void receive() {
        System.out.println("这是我最新买的,那去用吧!!");
    }
}
