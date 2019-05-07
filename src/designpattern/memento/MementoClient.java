package designpattern.memento;

/**
 * 备忘录模式
 *
 * 在不破坏封闭的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
 */
public class MementoClient {

    public static void main(String[] args) {
        Originator originator = new Originator();     //发起人
        MementoMgt mementoMgt = new MementoMgt();     //备忘录管理，负责存储历史状态

        originator.setState("2017-01-01");
        originator.setX(1.4f);
        originator.setY(5.4f);
        mementoMgt.add(originator.saveToMemento());    //记录状态

        originator.setState("2017-04-03");
        originator.setX(44.4f);
        originator.setY(52.4f);
        mementoMgt.add(originator.saveToMemento());    //记录状态

        originator.setState("2017-06-01");
        originator.setX(231.4f);
        originator.setY(555.4f);
        mementoMgt.add(originator.saveToMemento());    //记录状态

        originator.setState("2017-06-22");
        originator.setX(132.4f);
        originator.setY(53.4f);
        mementoMgt.add(originator.saveToMemento());    //记录状态

        System.out.println("状态历史：");
        for (Memento m : mementoMgt.getMementoList()) {
            System.out.println(m.getState() + ": " + m.getX() + ", " + m.getY());
        }

        System.out.println("当前状态：");
        System.out.println(originator.getState() + ": " + originator.getX() + ", " + originator.getY());

        originator.restoreFromMemento(mementoMgt.getByState("2017-04-03")); //恢复到指定状态--2017-04-03
        System.out.println("恢复后的状态：");
        System.out.println(originator.getState() + ": " + originator.getX() + ", " + originator.getY());
    }
}