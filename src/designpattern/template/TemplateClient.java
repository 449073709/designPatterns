package designpattern.template;

import org.junit.Test;

/**
 * 模板方法模式
 *
 * 定义一个操作中的算法骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
 */
public class TemplateClient {

    @Test
    public void test() {
        AbstractTemplate templateA = new ConcreteClassA();
        AbstractTemplate templateB = new ConcreteClassB();

        templateA.templateMethod();
        templateB.templateMethod();
    }

}
