package facade.demo1;

public class Computer {
    public void startComputer() {
        CPU cpu = new CPU();
        Momery momery = new Momery();
         byte[] aa={1,2};
        momery.load(1, aa);
        cpu.jump(1);
        cpu.execute();
    }
}
