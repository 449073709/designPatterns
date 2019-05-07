package designpattern.responsibilitychain;

/**
 * 职责链模式
 *
 * 将能够处理同一类请求的对象连成一条链，使这些对象都有机会处理请求，所提交的请求沿着链传递。
 * 从而避免请求的发送者和接受者之间的耦合关系。
 * 链上的对象逐个判断是否有能力处理该请求，如果能则就处理，如果不能，则传给链上的下一个对象，直到有一个对象处理它为止。
 */
public class Client {

    public static void main(String[] args) {
        Handler villageHandler = new VillageHandler();
        Handler townHandler = new TownHandler();
        Handler countyHandler = new CountyHandler();
        
        villageHandler.setNext(townHandler);
        townHandler.setNext(countyHandler);
        
        System.out.println("county request:");
        villageHandler.handleRequest("county");

        System.out.println("-------------------");

        System.out.println("city request:");
        villageHandler.handleRequest("city");
    }
}