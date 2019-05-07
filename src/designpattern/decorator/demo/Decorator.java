package designpattern.decorator.demo;

// 修饰的抽象类
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}

//具体类-最高成绩修饰类
class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("最高成绩是:xx");
    }
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}

//具体类-排名情况修饰类
class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    public void reportSort() {
        System.out.println("排名情况是:xx");
    }

    @Override
    public void report() {
        this.reportSort();
        super.report();
    }
}