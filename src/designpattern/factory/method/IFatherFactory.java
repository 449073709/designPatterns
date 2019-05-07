package designpattern.factory.method;

/**
 * 工厂接口
 */
public interface IFatherFactory {
    Father createFather(String name);
}

//具体工厂类，创建具体产品类
class ChineseFatherFactory implements IFatherFactory{

    @Override
    public Father createFather(String name) {
        return new ChineseFather(name);
    }

}

//具体工厂类，创建具体产品类
class AmericanFatherFactory implements IFatherFactory{

    @Override
    public Father createFather(String name) {
        return new AmericanFather(name);
    }

}
