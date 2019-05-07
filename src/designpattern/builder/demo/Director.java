package designpattern.builder.demo;

//指挥者类
public class Director {

    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car createCar() {
        carBuilder.createCar();

        String frame = carBuilder.buildFrame();
        carBuilder.getCar().setFrame(frame);
        System.out.println("搭建好" + frame);

        String tire = carBuilder.buildTire();
        carBuilder.getCar().setTire(tire);
        System.out.println("在" + frame + "的四个轮胎槽安装" + tire);

        String engine = carBuilder.buildEngine();
        carBuilder.getCar().setEngine(engine);
        System.out.println("在" + frame + "上放置" + engine);

        String shell = carBuilder.buildCarShell();
        carBuilder.getCar().setCarShell(shell);
        System.out.println("最后套上" + shell);
        return carBuilder.getCar();
    }

}
