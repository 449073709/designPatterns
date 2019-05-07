package designpattern.builder;

/**
 * 建造者模式
 */
public class BuilderClient {

    public static void main(String[] args) {
        Director director = new Director();

        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        //指挥者“指挥”建造者“创建”出对应产品
        Product product1 = director.construct(builder1);
        product1.show();

        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        Product product2 = director.construct(builder2);
        product2.show();
    }

}
