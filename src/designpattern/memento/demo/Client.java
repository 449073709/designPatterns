package designpattern.memento.demo;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        Caretaker caretaker = new Caretaker();
        GameRole gr = new GameRole();

        //战斗前先备份一下
        caretaker.setMemento(gr.createMemento());
        gr.stateDisplay();

        //大战Boss，损耗严重
        gr.fight();
        gr.stateDisplay();

        //恢复备份
        gr.restoreMemento(caretaker.getMemento());
        gr.stateDisplay();

    }

}
