package designpattern.composite;

/**
 * 组合模式
 * 将对象组合成树形结构以表示“部分整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
 */
public class CompositeClient {

    public static void main(String[] args) {
        Component root = new Composite("总公司");

        root.add(new Leaf("总公司财务部"));
        root.add(new Leaf("总公司开发部"));
        root.add(new Leaf("总公司人事部"));

        Component sub1 = new Composite("子公司1");
        sub1.add(new Leaf("子公司1财务部"));
        sub1.add(new Leaf("子公司1开发部"));
        sub1.add(new Leaf("子公司1人事部"));
        root.add(sub1);

        Component sub2 = new Composite("子公司2");
        sub2.add(new Leaf("子公司2财务部"));
        sub2.add(new Leaf("子公司2开发部"));
        sub2.add(new Leaf("子公司2人事部"));
        root.add(sub2);

        root.show(0);
    }


}
