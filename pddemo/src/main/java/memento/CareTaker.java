package memento;

import java.util.ArrayList;
import java.util.List;


/**
 * 这个实际上是一个管理类,用来存储Originator生成的Memento类
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
