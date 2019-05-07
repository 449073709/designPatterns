package designpattern.builder.demo;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new BWMBuilder());
        //宝马
        Car bwmCar = director.createCar();
        System.out.println(bwmCar);

        System.out.println("------------");

        //奥迪
        director = new Director(new AudiBuilder());
        Car audiCar = director.createCar();
        System.out.println(audiCar);
    }

}
