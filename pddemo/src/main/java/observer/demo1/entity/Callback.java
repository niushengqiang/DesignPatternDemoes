package observer.demo1.entity;

public class Callback {
    public void execcallback(EventType et){
        System.out.println("执行完"+et+"的回调函数");
    }

}
