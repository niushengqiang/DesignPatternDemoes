package mediator.demo2;

/**
 * 表示一个员工类每一个员工都具有接收和发送请求的方法
 */
public interface Employee {
    void speak(String message);
    void receive();
}
