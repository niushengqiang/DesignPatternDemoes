package visitor.demo2;

public class SuccessAction extends Action{

    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人成功时,背后多半有个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人成功时,背后多半有个不靠谱的男人");
    }
}
