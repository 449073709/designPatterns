package designpattern.interpreter;

/**
 * 声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享
 */
public abstract class AbstractExpression {
    public abstract void interpret(Context context);
}

/**
 * 非终结符表达式，为文法中的非终结符实现解释操作。对文法中每一条规则R1、R2 ... ... Rn都需要一个具体的非终结符表达式类。
 */
class NonTerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }

}

/**
 * 实现与文法中的终结符相关联的解释操作，文法中每一个终结符都有一个具体终结表达式与之相对应
 */
class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");

    }

}
