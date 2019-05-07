package designpattern.factory.abstraction;

public interface IFather {
    public void printName();
}

//
class ChineseFather implements IFather {
    private String name;

    public ChineseFather(String name) {
        this.name = name;
        System.out.println("create a cn father.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);
    }
}

//
class AmericanFather implements IFather {
    private String name;

    public AmericanFather(String name) {
        this.name = name;
        System.out.println("create a us father.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);

    }
}
