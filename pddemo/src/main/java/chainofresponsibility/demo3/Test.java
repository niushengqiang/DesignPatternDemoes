package chainofresponsibility.demo3;

public class Test {

    public static void main(String[] args) {
        //创建执行器链

        CommandInter execCommand = new ExecCommand();
        new Thread((Runnable) execCommand).start();
        PreComand preComand = new PreComand();
        new Thread((Runnable) preComand).start();
        SaveCommand saveCommand = new SaveCommand();
        new Thread((Runnable) saveCommand).start();


        preComand.setCommandInter(saveCommand);
        saveCommand.setCommandInter(execCommand);
        preComand.execCommand(" 写代码 ");


    }
}
