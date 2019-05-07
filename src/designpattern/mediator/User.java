package designpattern.mediator;

public abstract class User {

    private String name;

    protected Mediator mediator;

    public User(String name) {
        this.name = name;
    }

    /**
     * 供中介对象调用
     */
    protected void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 发送信息到中介
     */
    protected abstract void sendMessage(String msg);

    /**
     * 供中介对象调用，获取其它用户对象发送的信息
     */
    protected abstract void getMessage(String msg);

    //get、set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//
class CommonUser extends User {

    public CommonUser(String name) {
        super(name);
    }

    @Override
    protected void sendMessage(String msg) {
        this.mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println(this.getName() + " get msg:" + msg);
    }

}

//
class VIPUser extends User {
    public VIPUser(String name) {
        super(name);
    }

    @Override
    protected void sendMessage(String msg) {
        this.mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println(this.getName() + " get msg:" + msg);
    }

}