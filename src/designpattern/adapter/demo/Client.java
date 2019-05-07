package designpattern.adapter.demo;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        ChineseAdditionUtil ChineseAdditionUtil = new Adapter();
        int result = ChineseAdditionUtil.加法('三', '九');
        System.out.println("结果为：" + result);
    }
}
