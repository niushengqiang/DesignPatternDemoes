package command.mydemo2;

public class CommandB implements Command{
    private Receiver receiver;

    public CommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.doCommanderB();
    }
}
