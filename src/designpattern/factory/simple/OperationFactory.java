package designpattern.factory.simple;

public class OperationFactory {

    public static Operation createOperation(char operate) {
        switch (operate) {
            case '+':
                return new OperationAdd();
            case '-':
                return new OperationSub();
            case '*':
                return new OperationMul();
            case '/':
                return new OperationDiv();
            default:
                throw new RuntimeException("运算符输入错误");
        }
    }

}
