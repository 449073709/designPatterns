package designpattern.strategy;

/**
 * 策略模式
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context = new Context(new WalkStrategy());
        context.execute();

        context.switchStrategy(new DriveStrategy());
        context.execute();
    }
}