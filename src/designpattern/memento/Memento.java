package designpattern.memento;

public class Memento {
    private String state;
    private float x;
    private float y;

    public Memento(String state, float x, float y) {
        this.state = state;
        this.x = x;
        this.y = y;
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