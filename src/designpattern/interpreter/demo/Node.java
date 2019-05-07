package designpattern.interpreter.demo;

/**
 * 抽象表达式
 */
public interface Node {
    int interpret();
}


//具体类-解释表达式的值（属于非终结表达式）
class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}

/**
 * 抽象符号表达式（属于终结表达式）
 */
abstract class SymbolNode implements Node {
    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}

//具体类-乘法符号表达式类
class MulNode extends SymbolNode {
    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}

//具体类-模符号表达式类
class ModNode extends SymbolNode {
    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() % right.interpret();
    }
}

//具体类-除法符号表达式类
class DivNode extends SymbolNode {
    public DivNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}

