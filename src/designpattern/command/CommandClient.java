package designpattern.command;

/**
 * 命令模式
 *
 * 将请求封装成对象，以便使用不同的请求、日志、队列等来参数化其他对象。命令模式也支持撤销操作。
 */
public class CommandClient {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();
        
        Command turnOnLight = new LightOnCommand(receiver);
        Command turnOffLight = new LightOffCommand(receiver);
        
        invoker.execute(turnOnLight);
        invoker.execute(turnOffLight);
    }
}