package visitor.demo2;

public class Woman implements Persion {
    @Override
    public void accept(Action action) {
        action.getWomanConclusion(this);
    }
}
