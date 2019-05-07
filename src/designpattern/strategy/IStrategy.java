package designpattern.strategy;

public interface IStrategy {
    void execute();
}

//开车策略
class DriveStrategy implements IStrategy {

    @Override
    public void execute() {
        System.out.println("driving。。。");
    }

}

//步行策略
class WalkStrategy implements IStrategy {

    @Override
    public void execute() {
        System.out.println("walking。。。");
    }

}