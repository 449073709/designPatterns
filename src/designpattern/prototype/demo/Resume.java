package designpattern.prototype.demo;

import java.io.*;

//简历类
public class Resume implements Cloneable, Serializable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeDate, String company) {
        work.setWorkDate(timeDate);
        work.setWorkCompany(company);
    }

    //显示
    public void display() {
        System.out.println(String.format("%s %s %s", name, sex, age));
        System.out.println(String.format("工作经历：%s %s", work.getWorkDate(), work.getWorkCompany()));
    }

    //浅克隆，通过JDK自带的clone方法
    @Override
    protected Resume clone() throws CloneNotSupportedException {
        //自身克隆一份
        return (Resume) super.clone();
    }

    // 深克隆，通过对象序列化
    public Resume deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流内
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 从流内读出对象
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(
                bos.toByteArray()));
        return (Resume) ois.readObject();

    }

}
