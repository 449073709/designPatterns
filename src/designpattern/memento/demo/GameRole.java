package designpattern.memento.demo;

public class GameRole {

    //生命力
    private int vit;
    //攻击力
    private int atk;
    //防御力
    private int def;

    public GameRole() {
        //初始值
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    //战斗
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    //状态显示
    public void stateDisplay() {
        System.out.println("GameRole{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}');
    }

    //恢复备忘录
    public void restoreMemento(Memento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    //创建备忘录
    public Memento createMemento() {
        return new Memento(vit, atk, def);
    }

    //get、set
    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
