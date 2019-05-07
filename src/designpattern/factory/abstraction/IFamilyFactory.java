package designpattern.factory.abstraction;

/**
 * 抽象工厂模式
 * father + mother + sister + ... = 产品族  //抽象工厂模式
 * cnfather + usfather + ukfather + ... = 产品等级  //工厂方法模式
 */
public interface IFamilyFactory {
    IFather createFather(String name);

    IMother createMother(String name);
}

//
class ChineseFamilyFactory implements IFamilyFactory{

    @Override
    public IFather createFather(String name) {
        return new ChineseFather(name);
    }

    @Override
    public IMother createMother(String name) {
        return new ChineseMother(name);
    }

}

//
class AmericanFamilyFactory implements IFamilyFactory{

    @Override
    public IFather createFather(String name) {
        return new AmericanFather(name);
    }

    @Override
    public IMother createMother(String name) {
        return new AmericanMother(name);
    }

}