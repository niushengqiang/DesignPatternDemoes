package visitor.demo2;

/**
 * 测试访问者模式的
 */
public class TestDemo2ForVisitor {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        //这里测试成功的状态
        Action action = new SuccessAction();
        man.accept(action);
        woman.accept(action);
        //这里新增失败的状态,这个状态是后加的
        Action failAction = new FailAction();
        man.accept(failAction);
        woman.accept(failAction);
    }
}
