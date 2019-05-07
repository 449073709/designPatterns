package designpattern.template;

/**
 * 模板方法抽象类：不变的部分给出具体实现，变化的部分封装为抽象方法延迟到子类实现
 */
public abstract class AbstractTemplate {

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板方法结束");
    }
    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();
}

/**
 * 实现类A
 */
class ConcreteClassA extends AbstractTemplate {
    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类A的方法1实现");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类A的方法2实现");
    }
}

/**
 * 实现类A
 */
class ConcreteClassB extends AbstractTemplate {

    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B的方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B的方法2实现");
    }

}