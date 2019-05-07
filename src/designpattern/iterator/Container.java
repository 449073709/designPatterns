package designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

//抽象容器
public abstract class Container {

    public abstract Iterator iterator();

    public abstract void put(Object obj);
}

//具体类
class MyContainer extends Container {
    private List<Object> list = new ArrayList<>();

    @Override
    public void put(Object obj) {
        this.list.add(obj);
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(list);
    }

}