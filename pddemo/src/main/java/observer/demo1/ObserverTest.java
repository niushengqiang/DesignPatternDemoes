package observer.demo1;

import observer.demo1.entity.Callback;
import observer.demo1.entity.Event;
import observer.demo1.entity.EventListener;
import observer.demo1.entity.EventType;

import java.lang.reflect.Method;

public class ObserverTest {
    public static void main(String[] args) throws NoSuchMethodException {

        Class<Callback> callbackClass = Callback.class;
        Method callbackMethod = callbackClass.getMethod("execcallback", EventType.class);

        Event addEvent = new Event(EventType.ADD,callbackMethod,new Object[]{EventType.ADD},new Callback());
        Event removeEvent = new Event(EventType.REMOVE,callbackMethod,new Object[]{EventType.REMOVE},new Callback());
        Event editEvent = new Event(EventType.EDIT,callbackMethod,new Object[]{EventType.EDIT},new Callback());
        Event queryEvent = new Event(EventType.QUERY,callbackMethod,new Object[]{EventType.QUERY},new Callback());

        EventListener eventListener = new EventListener();
        eventListener.add(addEvent);
        eventListener.add(removeEvent);
        eventListener.add(editEvent);
        eventListener.add(queryEvent);

        IBusinessInterface business = new BusinessImpl(eventListener);
        business.login("123","123");
    }
}
