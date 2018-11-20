package delegate.vippush;

import java.util.HashMap;
import java.util.Map;

/**
 * 这里是代理模式的代理入口类,实际上不一定非要实现接口.具体要不要实现可以根据具体的业务进行处理
 */
public class MessagePushLeader implements IMessagePush{

    static Map<String,IMessagePush> mm=new HashMap<String,IMessagePush>();
    static{
        mm.put("1",new MessagePushImpl1());
        mm.put("2",new MessagePushImpl2());
    }

    @Override
    public void push(String json) {
        char c = json.charAt(0);
        String type=c+"";
        IMessagePush push = mm.get(type);
        String substring = json.substring(1,json.length());
        push.push(substring);
    }
}
