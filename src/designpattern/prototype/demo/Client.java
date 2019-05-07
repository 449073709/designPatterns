package designpattern.prototype.demo;

import org.junit.Test;

public class Client {

    @Test
    public void test() throws Exception {
        Resume wang = new Resume("小王");
        wang.setPersonalInfo("男", "29");
        wang.setWorkExperience("1998-2000", "XX公司");

        //浅克隆
        Resume clone = wang.clone();
        //深克隆
        Resume deepClone = wang.deepClone();

        //当小王的工作经历（引用对象的属性）改变时
        wang.setWorkExperience("2010-2020", "QQ公司");

        clone.display();
        deepClone.display();


    }

}
