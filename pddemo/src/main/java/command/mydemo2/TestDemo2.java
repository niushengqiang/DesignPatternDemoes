package command.mydemo2;

public class TestDemo2 {
    public static void main(String[] args){
        Receiver receiver = new Receiver();

        CommandA commandA = new CommandA(receiver);
        CommandB commandB = new CommandB(receiver);

        Invoker invoker = new Invoker();

        invoker.execCommander(commandA);
        invoker.execCommander(commandB);
    }
}
