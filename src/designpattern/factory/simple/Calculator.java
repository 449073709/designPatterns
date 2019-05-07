package designpattern.factory.simple;


/**
 * 使用简单工厂模式生成实例完成运算操作
 */
public class Calculator {

    public static void main(String[] args) {
        try {
            //使用简单工厂模式生成实例完成运算操作
            Operation operation = OperationFactory.createOperation('*');
            operation.setNumberA(1.2);
            operation.setNumberB(1.4);
            System.out.println("结果为：" + operation.getResult());
        } catch (RuntimeException e) {
            System.out.println("您的输入有误：" + e.getMessage());
        }
    }

}
