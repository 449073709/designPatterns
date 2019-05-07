package designpattern.iterator;

/**
 * 迭代器模式
 *
 * 提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示
 */
public class IteratorClient {

    public static void main(String[] args) {

        //创建一个自定义容器，直接使用ArrayList的实现，仅仅示例作用
        Container strContainer = new MyContainer();
        strContainer.put("001");
        strContainer.put("002");
        strContainer.put("003");
        
        Iterator myIterator = strContainer.iterator();
        //使用举例
        System.out.println("------------------next、hasNext示例------------------");
        System.out.println(myIterator.first());
        System.out.println(myIterator.next());
        System.out.println(myIterator.hasNext());
        System.out.println(myIterator.next());
        System.out.println(myIterator.hasNext());
        System.out.println(myIterator.next());
        System.out.println(myIterator.hasNext());
        
        //使用举例
        System.out.println("------------------pre、hasNext示例------------------");
        System.out.println(myIterator.pre());
        System.out.println(myIterator.pre());
        System.out.println(myIterator.pre());
        System.out.println(myIterator.hasNext());
        
        //使用迭代器遍历
        System.out.println("------------------迭代器遍历示例------------------");
        System.out.println(myIterator.first());
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}