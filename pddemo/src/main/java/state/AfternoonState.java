package state;

public class AfternoonState implements State{
    @Override
    public void writerProgram(Work work) {
        double hour = work.getHour();
        if(hour<18){
            System.out.println("下午状态还不错继续努力");
        }else{
            work.setCurrent(new EveningState());
            work.writerProgram();
        }
    }
}
