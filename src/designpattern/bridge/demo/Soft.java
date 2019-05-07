package designpattern.bridge.demo;

public abstract class Soft {

    public abstract void run();

}

class GameSoft extends Soft {

    @Override
    public void run() {
        System.out.println("运行手机游戏");
    }

}

class AddressListSoft extends Soft {

    @Override
    public void run() {
        System.out.println("运行手机通讯录");
    }

}