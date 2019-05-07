package designpattern.command.demo;

public class Client {

    public static void main(String[] args) {
        //开店准备
        Cook cook = new Cook();//厨师
        Command bakeChickenWingCommand = new BakeChickenWingCommand(cook);//烤肉菜单1
        Command bakeMuttonCommand = new BakeMuttonCommand(cook);//烤肉菜单2
        Waiter waiter = new Waiter();//服务员

        //开门营业

        //服务员，3个鸡翅3个羊肉串
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        //服务员，烤鸡翅少烤2个，吃不完
        waiter.cancelOrder(bakeChickenWingCommand);
        waiter.cancelOrder(bakeChickenWingCommand);
        waiter.notifyCook();

        //服务员，4个鸡翅2个羊肉串
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.notifyCook();

        //服务员，3个鸡翅
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.notifyCook();

    }
}