package designpattern.command;

public interface Command {
    void execute();
}

//关灯命令
class LightOffCommand implements Command{
    private Receiver receiver;

    public LightOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.turnOFF();
    }
}

//开灯命令
class LightOnCommand implements Command{

    private Receiver receiver;

    public LightOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnON();
    }

}