package designpattern.builder;

public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getBuildResult();

}

/**
 * 具体建造者类，建造的对象是Product，通过build使Product完善
 */
class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getBuildResult() {
        return product;
    }
}

/**
 * 具体建造者类，建造的对象是Product，通过build使Product完善
 */
class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getBuildResult() {
        return product;
    }

}