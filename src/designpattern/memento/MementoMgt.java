package designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoMgt {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public List<Memento> getMementoList() {
        return mementoList;
    }

    public Memento getByState(String state) {
        for (Memento memento : mementoList) {
            if (memento.getState().equals(state)) {
                return memento;
            }
        }
        return null;
    }
}
