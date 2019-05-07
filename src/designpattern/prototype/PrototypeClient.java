package designpattern.prototype;

import org.junit.Test;

/**
 * 原型模式：拷贝原型实例本身创建新的对象
 */
public class PrototypeClient {

    @Test
    public void test() throws CloneNotSupportedException {
        Prototype prototype = new Prototype("1");
        for (int i = 0; i < 10; i++) {
            //本例使用浅拷贝，深拷贝例子见demo
            Prototype copy = prototype.clone();
            System.out.println(copy.hashCode() + ":" + copy.getId());
        }
    }

}
