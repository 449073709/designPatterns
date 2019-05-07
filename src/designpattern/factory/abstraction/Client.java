package designpattern.factory.abstraction;

/**
 * 使用抽象工厂模式
 *
 * father + mother + sister + ... = 产品族  //抽象工厂模式
 * cnfather + usfather + ukfather + ... = 产品等级  //工厂方法模式
 */
public class Client {
    public static void main(String[] args) {

        IFamilyFactory cnFamilyFactory = new ChineseFamilyFactory();
        IFamilyFactory usFamilyFactory = new AmericanFamilyFactory();

        IFather cnFather = cnFamilyFactory.createFather("cn father");
        IMother cnMother = cnFamilyFactory.createMother("cn mother");

        IFather usFather = usFamilyFactory.createFather("us father");
        IMother usMother = usFamilyFactory.createMother("us mother");

        cnFather.printName();
        cnMother.printName();
        usFather.printName();
        usMother.printName();
    }
}