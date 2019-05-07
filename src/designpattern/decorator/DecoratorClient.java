package designpattern.decorator;

/**
 * 装饰模式客户端调用代码，装饰的过程更像是层层包装，用前面的对象装饰后面的对象
 */
public class DecoratorClient {
    public static void main(String[] args) {
	ConcreteComponent component = new ConcreteComponent();

	ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
	ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
	ConcreteDecoratorC decoratorC = new ConcreteDecoratorC(decoratorB);

	decoratorC.operation();

    }
}