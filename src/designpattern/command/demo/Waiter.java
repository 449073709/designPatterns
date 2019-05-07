package designpattern.command.demo;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> commandList = new ArrayList<>();
    private int count = 0;

    //设置订单
    public void setOrder(Command command) {
        commandList.add(command);
    }

    //取消订单
    public void cancelOrder(Command command) {
        commandList.remove(command);
    }

    //通知执行
    public void notifyCook() {
        count++;
        System.out.println("------订单" + count + "-----");
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

}
