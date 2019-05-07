package designpattern.factory.abstraction;

public interface IMother {
    void printName();
}

//
class ChineseMother implements IMother {
    private String name;

    public ChineseMother(String name) {
        this.name = name;
        System.out.println("create a cn mother.");
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
class AmericanMother implements IMother {
    private String name;

    public AmericanMother(String name) {
        this.name = name;
        System.out.println("create a us mother.");
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