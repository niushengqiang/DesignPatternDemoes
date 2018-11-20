package observer.demo2;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventListener {

    public final  static Map<EventType,Event> map=new HashMap<EventType,Event>();


    public void add(Event e){
        map.put(e.getEventType(),e);
    }


    public void remove(Event e){
        map.remove(e.getEventType());
    }

    public Object trigger(EventType et){
        Object retrun=null;
        Event event = map.get(et);
        if(null==event)return retrun;

        Object[] callbackArgs = event.getCallbackArgs();
        Method callback =event.getCallback();
        try {
            retrun = callback.invoke(event.getTarget(), callbackArgs);
        }catch( Exception ex) {
            ex.printStackTrace();
        }
        return retrun;
    }
}
