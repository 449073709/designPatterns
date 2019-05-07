package designpattern.prototype;

public class Prototype implements Cloneable {

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public String getId() {
        return id;
    }
}
