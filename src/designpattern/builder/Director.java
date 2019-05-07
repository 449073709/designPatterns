package designpattern.builder;

/**
 * 指挥者类，用来指挥建造过程
 */
public class Director {

    public Product construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        return builder.getBuildResult();
    }
}