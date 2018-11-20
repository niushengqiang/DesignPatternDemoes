package template.simpletemplate;

/**
 * 下班回家的执行过程
 */
public abstract class GotHomeProcess {

    public abstract void step1();
    public abstract void step2();
    public abstract void step3();


    public  void gothome(){
        step1();
        step2();
        step3();
    }
}
