package command.mydemo2;

public class CommandA implements Command{
    private  Receiver receiver;

    public CommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.doCommanderA();
    }
}
