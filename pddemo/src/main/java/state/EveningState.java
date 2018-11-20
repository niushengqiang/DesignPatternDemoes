package state;

public class EveningState implements State{
    @Override
    public void writerProgram(Work work) {
        double hour = work.getHour();
        if(work.isFinish()){
            work.setCurrent(new RestState());
            work.writerProgram();
        }else if(hour<22){
            work.setCurrent(new SleepingState());
            work.writerProgram();
        }else{
            System.out.println("工作已经忙的快要猝死了!!太累了");
        }
    }
}
