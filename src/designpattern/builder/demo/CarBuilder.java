package designpattern.builder.demo;

//汽车建造者
public abstract class CarBuilder {

    private Car car;

    public abstract String buildEngine();

    public abstract String buildTire();

    public abstract String buildCarShell();

    public abstract String buildFrame();

    public void createCar() {
        car = new Car();
    }

    public Car getCar() {
        return this.car;
    }


}

//具体建造者
class BWMBuilder extends CarBuilder {
    @Override
    public String buildEngine() {
        return "BWM发动机";
    }

    @Override
    public String buildTire() {
        return "BWM轮胎";
    }

    @Override
    public String buildCarShell() {
        return "BWM车壳";
    }

    @Override
    public String buildFrame() {
        return "BWM车架";
    }

}

//具体建造者
class AudiBuilder extends CarBuilder {
    @Override
    public String buildEngine() {
        return "Audi发动机";
    }

    @Override
    public String buildTire() {
        return "Audi轮胎";
    }

    @Override
    public String buildCarShell() {
        return "Audi车壳";
    }

    @Override
    public String buildFrame() {
        return "Audi车架";
    }
}
