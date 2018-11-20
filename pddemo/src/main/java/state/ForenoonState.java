package state;

public class ForenoonState implements State{

    @Override
    public void writerProgram(Work work) {
        double hour = work.getHour();
        if(hour<12){
            System.out.println("上午工作精神百倍");
        }else{
            work.setCurrent(new NoonState());
            work.writerProgram();
        }

    }
}
