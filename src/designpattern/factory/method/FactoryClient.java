package designpattern.factory.method;

/**
 * 使用工厂方法模式
 *
 * father + mother + sister + ... = 产品族  //抽象工厂模式
 * cnfather + usfather + ukfather + ... = 产品等级  //工厂方法模式
 */
public class FactoryClient {
    public static void main(String[] args) {
        //客户端需要决定实例化哪一个工厂类
        IFatherFactory cnff = new ChineseFatherFactory();
        Father cnFather = cnff.createFather("cn father");
        cnFather.printName();

        //客户端需要决定实例化哪一个工厂类
        IFatherFactory usff = new AmericanFatherFactory();
        Father usFather = usff.createFather("us father");
        usFather.printName();
    }

}