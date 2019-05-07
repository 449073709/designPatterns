package designpattern.decorator;

/**
 * Component是定义一个对象接口，可以给这些对象动态地添加职责
 */
public abstract class Component {
    public abstract void operation();
}


/**
 * 具体对象，也可以给这个对象添加一些职责
 */
class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }

}