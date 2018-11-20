package observer.demo2;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Event {

    private EventType eventType;//事件类型

    private String createDate; //事件创建时间


    //这里同样可以用接口的泛型来做
    private Method callback;//回调函数
    private Object[] callbackArgs;//回调函数的参数
    private Object target;//执行方法的目标对象



    public Event(EventType eventType, Method callback, Object[] callbackArgs, Object target) {
        this.eventType = eventType;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        this.createDate = sdf.format(date);
        this.callback = callback;
        this.callbackArgs = callbackArgs;
        this.target=target;
    }

    public EventType getEventType() {
        return eventType;
    }


    public Method getCallback() {
        return callback;
    }

    public Object[] getCallbackArgs() {
        return callbackArgs;
    }


    public Object getTarget() {
        return target;
    }
}
