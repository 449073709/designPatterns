package designpattern.mediator;

/**
 * 中介者模式
 *
 *中介者模式就是用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。
 */
public class MediatorClient {

    public static void main(String[] args) {
        CommonUser user1 = new CommonUser("小王");
        CommonUser user2 = new CommonUser("小陈");
        VIPUser vipUser = new VIPUser("小张");
        
        Mediator chatRoom = new ChatRoomMediator();
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(vipUser);

        user2.sendMessage("hello everybody~");
        
    }
}