package command.mydemo2;

public class Invoker {
    public void execCommander(Command command ){
        try{
            System.out.println("这里可以动态代理执行...");
            System.out.println("这里可以动态代理添加日志...");
            command.exec();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("进行异常的回滚,任务的撤回");
        }
    }
}
