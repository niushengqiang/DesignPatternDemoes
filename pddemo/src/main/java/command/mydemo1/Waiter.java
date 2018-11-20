package command.mydemo1;

import command.mydemo2.Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Commander> commanderList=new ArrayList<Commander>();

    public Waiter() {
    }

    public  void orderFood(Commander c){
        if(c instanceof BBQForChickenWings){
            System.out.println("鸡翅没有了选点别的吧");
        }else{
            System.out.println("您点了羊肉串");
            commanderList.add(c);
        }
    }

    public void cancleOrder(Commander commander){
        if(commander!=null){
            commanderList.remove(commander);
        }
    }


    public  void over(){
        for (Commander c :commanderList) {
            c.bbq();
        }
    }


}
