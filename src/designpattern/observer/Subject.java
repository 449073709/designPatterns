package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    //增加观察者
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //移除观察者
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知
    public void doNotify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}

//
class ConcreteSubject extends Subject {

    //被观察者状态
    private String subjectStatus;

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
    }
}
