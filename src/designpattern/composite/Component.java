package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void show(int depth);

}

//具体类-叶节点
class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    //叶节点无需实现
    @Override
    public void add(Component component) {

    }

    //叶节点无需实现
    @Override
    public void remove(Component component) {

    }

    @Override
    public void show(int depth) {
        System.out.println(
                new String(new char[depth]).replace("\0", "-") + name);
    }
}

//具体类-非叶节点
class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void show(int depth) {
        System.out.println(
                new String(new char[depth]).replace("\0", "-") + name);
        for (Component component : components) {
            component.show(depth + 2);
        }
    }
}