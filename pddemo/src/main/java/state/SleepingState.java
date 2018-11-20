package state;

public class SleepingState implements State{
    @Override
    public void writerProgram(Work work) {
        System.out.println("工作已经累的睡着了");
    }
}
