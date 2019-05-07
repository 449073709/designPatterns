package designpattern.bridge.demo;

public abstract class Phone {

    // 桥接模式的关键，使得Abstraction聚合Implementor
    private Soft soft;

    public void setSoft(Soft soft) {
        this.soft = soft;
    }

    public void runSoft() {
        System.out.print(this.getClass().getSimpleName() + "手机: ");
        soft.run();
    }

}

class Xiaomi extends Phone {

    @Override
    public void runSoft() {
        super.runSoft();
    }

}

class IPhone extends Phone {

    @Override
    public void runSoft() {
        super.runSoft();
    }

}