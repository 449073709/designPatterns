package designpattern.observer;

import org.junit.Test;

/**
 * 观察者模式。也称发布-订阅模式
 */
public class ObserverClient {

    @Test
    public void test() {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("观察者1", subject);
        ConcreteObserver observer2 = new ConcreteObserver("观察者2", subject);
        ConcreteObserver observer3 = new ConcreteObserver("观察者3", subject);

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.setSubjectStatus("切换为关闭状态");
        System.out.println("主题切换为关闭状态");
        subject.doNotify();

        System.out.println("----");

        subject.detach(observer3);
        System.out.println("将" + observer3.getName() + "从主题中分离");
        subject.setSubjectStatus("切换为开启状态");
        System.out.println("主题切换为开启状态");
        subject.doNotify();
    }

}
