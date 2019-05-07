package designpattern.decorator.demo;

//抽象成绩单
public abstract class SchoolReport {
    //报告成绩
    public abstract void report();
    //家长签名
    public abstract void sign(String name);
}

//具体类-四年级成绩单
class FourthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的xx家长");
        System.out.println("成绩如下");
        System.out.println("语文90 数学95 英语92");
        System.out.println("------------------");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}