package designpattern.factory.method;

/**
 * 产品抽象类
 */
public abstract class Father {
    private String name;

    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.getName());
    }

    //get、set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//具体产品类
class ChineseFather extends Father {
    public ChineseFather(String name) {
        this.setName(name);
    }
}

//具体产品类
class AmericanFather extends Father {
    public AmericanFather(String name) {
        this.setName(name);
    }
}