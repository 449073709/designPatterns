package designpattern.bridge;

/**
 * 桥接模式
 *
 * 主要特点是把抽象(Abstraction)与行为实现(Implementation)分离开来，从而可以保持各部分的独立性以及应对他们的功能扩展。
 */
public class BridgeClient {
    public static void main(String[] args) {

	Abstraction a = new AbstractionA("A");
	a.setImplementor(new ConcreteImplemtorA());
	a.operation();
	a.setImplementor(new ConcreteImplemtorB());
	a.operation();

	Abstraction b = new AbstractionB("B");
	b.setImplementor(new ConcreteImplemtorA());
	b.operation();
	b.setImplementor(new ConcreteImplemtorB());
	b.operation();

	// 这样通过使用“组合/聚合复用原则”
	// 如果继续有AbstractionC ... 或者ConcreteImplemtorC ...
	// 只需要扩展类即可，不需要修改现有类，符合“开放-封闭”原则
    }

}