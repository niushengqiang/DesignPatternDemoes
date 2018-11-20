package template.simpletemplate;

public class GotHomeProcessImpl extends GotHomeProcess{
    @Override
    public void step1() {
        System.out.println("自己走了到北苑路北");
    }

    @Override
    public void step2() {
        System.out.println("碰见熟人一起做地铁");
    }

    @Override
    public void step3() {
        System.out.println("龙泽地铁站自己走回去");
    }
}
