package designpattern.memento.demo;

/**
 * 备忘录管理者
 */
public class Caretaker {

    private Memento memento;

    //get、set
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
