package designpattern.factory.simple;

//运算类
public abstract class Operation {

    private double numberA;
    private double numberB;

    //运算结果
    public abstract double getResult();

    //get、set
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}

//具体类-加法类
class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}

//具体类-除法类
class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            throw new RuntimeException("除数不能为0。");
        }
        return getNumberA() / getNumberB();
    }
}

//具体类-乘法类
class OperationMul extends Operation {

    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}

//具体类-减法类
class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}