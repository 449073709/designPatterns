package designpattern.builder.demo;

public class Car {

    //发动机
    private String engine;
    //轮胎
    private String tire;
    //车壳
    private String carShell;
    //车架
    private String frame;

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", tire='" + tire + '\'' +
                ", carShell='" + carShell + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }

    //get、set
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public String getCarShell() {
        return carShell;
    }

    public void setCarShell(String carShell) {
        this.carShell = carShell;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
