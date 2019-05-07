package designpattern.observer;

public abstract class Observer {
    public abstract void update();
}

//
class ConcreteObserver extends Observer {

    private String name;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        String subjectStatus = subject.getSubjectStatus();
        System.out.println(name + "收到被主题发来的信息：" + subjectStatus);
    }


    public String getName() {
        return name;
    }
}
