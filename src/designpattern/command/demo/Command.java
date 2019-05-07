package designpattern.command.demo;

//命令接口
public interface Command {

    void execute();

}

//具体类-烤羊肉命令
class BakeMuttonCommand implements Command {

    private Cook cook;

    public BakeMuttonCommand(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.bakeMutton();
    }
}

//具体类-烤鸡翅命令
class BakeChickenWingCommand implements Command {

    private Cook cook;

    public BakeChickenWingCommand(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.bakeChickenWing();
    }
}