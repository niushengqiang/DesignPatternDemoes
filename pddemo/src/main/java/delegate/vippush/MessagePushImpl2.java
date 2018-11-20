package delegate.vippush;

public class MessagePushImpl2 implements IMessagePush{
    @Override
    public void push(String json) {
            System.out.println("我是2号实现,我能胜任"+json);
    }
}
