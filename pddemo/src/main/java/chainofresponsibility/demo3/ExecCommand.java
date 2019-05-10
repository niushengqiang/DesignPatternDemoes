package chainofresponsibility.demo3;

import java.util.concurrent.LinkedBlockingQueue;

public class ExecCommand  implements CommandInter ,Runnable{

    private static final LinkedBlockingQueue<String> lbq=new LinkedBlockingQueue<String>();
    private CommandInter nextExecCommand;
    public void setCommandInter(CommandInter commandInter) {
        this.nextExecCommand = commandInter;
    }



    @Override
    public void execCommand(String command) {
        lbq.add(command);
    }

    @Override
    public void run() {
        while (true){
            String command=null;
            try {
                command = lbq.take();
                System.out.println("执行命令"+command);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(nextExecCommand!=null){
                nextExecCommand.execCommand(command);
            } else{
                System.out.println("执行链结束!!");
            }
        }
    }
}
