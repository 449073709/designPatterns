package designpattern.state;

public interface IState {
    void execute(StateContext context);
}

//开车状态
class DriveState implements IState {

    @Override
    public void execute(StateContext context) {
        System.out.println("driving。。。");
        context.setState(new WalkState());
    }

}

//步行状态
class WalkState implements IState {

    @Override
    public void execute(StateContext context) {
        System.out.println("walking。。。");
        context.setState(new DriveState());
    }

}