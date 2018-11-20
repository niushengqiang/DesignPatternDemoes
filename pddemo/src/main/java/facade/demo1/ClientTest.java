package facade.demo1;

public class ClientTest {
    /**
     * 对于复杂的电脑启动程序来讲,客户不用关注cpu如何调度,内存如何处理
     * 只是留一个开关在外部,让外部来进行开启,而不关心内部的调用
     * 这里是单一职责的一种体现.
     * @param args
     */
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
