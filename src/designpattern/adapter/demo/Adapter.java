package designpattern.adapter.demo;

/**
 * 适配器类
 */
public class Adapter implements ChineseAdditionUtil {

    private additionUtil additionUtil = new additionUtil();

    @Override
    public int 加法(char 整数一, char 整数二) {
        int numA = toInt(整数一);
        int numB = toInt(整数二);
        return additionUtil.add(numA, numB);
    }

    private int toInt(char 整数) {
        switch (整数) {
            case '零':
                return 0;
            case '一':
                return 1;
            case '二':
                return 2;
            case '三':
                return 3;
            case '四':
                return 4;
            case '五':
                return 5;
            case '六':
                return 6;
            case '七':
                return 7;
            case '八':
                return 8;
            case '九':
                return 9;
            case '十':
                return 10;
            default:
                throw new RuntimeException();
        }
    }
}
