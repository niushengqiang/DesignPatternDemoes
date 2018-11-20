package visitor.demo2;

/*
这个实现类当中,方法里进行了二次分配,重新分配了真正的实现类的实现方法.所以可以轻松做到解耦.
真正实现开闭原则
 */
public class Man implements Persion{
    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
