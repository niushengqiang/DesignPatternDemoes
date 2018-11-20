package delegate.vippush;

public class MessagePushImpl1 implements  IMessagePush{

    @Override
    public void push(String json) {
        System.out.println("我是1号实现,我能处理业务"+json);
    }
}
