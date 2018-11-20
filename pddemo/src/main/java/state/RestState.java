package state;

public class RestState implements State{
    @Override
    public void writerProgram(Work work) {
        System.out.println("回家休息!!!");
    }
}
