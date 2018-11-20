package mediator.demo2;

public class ZhangSan implements Employee{

    @Override
    public void speak(String message) {
        System.out.println("你好,请借我笔用下");
    }

    @Override
    public void receive() {
        System.out.println("好的谢谢你了");
    }
}
