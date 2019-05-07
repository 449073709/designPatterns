package designpattern.decorator;

/**
 * Decorator，装饰抽象类，继承了Component，从外类来扩展Component类的功能，但对于Component来说，
 * 是无需知道Decorator的存在的
 */
public abstract class Decorator extends Component {
    protected Component component;


    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

}

class ConcreteDecoratorA extends Decorator {
    //新增的属性
    private String state;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 首先运行原Component的operation()，再执行本类的功能，如addedState，相当于对原Component进行了装饰
        super.operation();
        System.out.println("A新增了一个属性state");
    }

    //get、set
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("B新增了一个行为show()");
    }

    //新增的行为
    public void show() {

    }
}

class ConcreteDecoratorC extends Decorator {
    public ConcreteDecoratorC(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("C没有特殊行为");
    }

}