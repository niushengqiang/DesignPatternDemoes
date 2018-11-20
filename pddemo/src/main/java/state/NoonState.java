package state;

public class NoonState implements State{
    @Override
    public void writerProgram(Work work) {
        double hour = work.getHour();
        if(hour<13){
            System.out.println("中午工作饿了,先去吃点饭");
        }else{
            work.setCurrent(new AfternoonState());
            work.writerProgram();
        }
    }
}
