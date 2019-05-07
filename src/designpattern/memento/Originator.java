package designpattern.memento;

/**
 * 发起人角色，希望存储自己的历史状态
 */
public class Originator {

    private String state;
    private float x;
    private float y;

    public Memento saveToMemento() {
        return new Memento(state, x, y);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    //get、set
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}