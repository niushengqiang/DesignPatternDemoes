package state;

public class TestStateModel {
    public static void main(String[] args) {
        Work work = new Work();
        work.writerProgram();
        work.setHour(10);
        work.writerProgram();
        work.setHour(12);
        work.writerProgram();
        work.setHour(14);
        work.writerProgram();
        work.setHour(16);
        work.writerProgram();
        work.setHour(18);
        work.setFinish(true);
        work.writerProgram();
        work.setHour(20);
        work.writerProgram();
        work.setHour(22);
        work.writerProgram();
        work.setHour(23);
    }
}
