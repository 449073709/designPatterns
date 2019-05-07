package designpattern.template.demo;

public abstract class Day {

    public void getUp() {
        System.out.println("get up~");
    }

    public abstract void breakfast();

    public abstract void goToWork();

    public abstract void working();

    public abstract void lunch();

    public abstract void goHome();

    public abstract void supper();

    public void sleep() {
        System.out.println("sleep~");
    }

    //模板方法
    public final void process() {
        getUp();
        breakfast();
        goToWork();
        working();
        lunch();
        working();
        goHome();
        supper();
        sleep();
    }
}

class ProgrammerDay extends Day{

    @Override
    public void breakfast() {
        System.out.println("breakfast:noodle~");

    }

    @Override
    public void goToWork() {
        System.out.println("goToWork:drive car~");

    }

    @Override
    public void working() {
        System.out.println("working: coding~");

    }

    @Override
    public void lunch() {
        System.out.println("lunch: eat rice~");

    }

    @Override
    public void goHome() {
        System.out.println("goHome: walk~");
    }

    @Override
    public void supper() {
        System.out.println("supper: rice~");
    }

}