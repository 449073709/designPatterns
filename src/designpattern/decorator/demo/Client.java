package designpattern.decorator.demo;

public class Client {

    public static void main(String[] args) {
        //普通成绩单
        SchoolReport report = new FourthGradeSchoolReport();
        report.report();

        //最高成绩装饰器
        report = new HighScoreDecorator(report);
        report.report();

        //排名情况装饰器
        report = new SortDecorator(report);
        report.report();

    }

}
