package designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {

    protected List<User> userList;

    public Mediator() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        user.setMediator(this);
        this.userList.add(user);
    }

    public abstract void operation(User user, String msg);
}

//
class ChatRoomMediator extends Mediator {

    @Override
    public void operation(User user, String msg) {
        System.out.println(user.getName() + "send a msg : " + msg);
        for(User userTmp : this.userList){
            userTmp.getMessage(msg);
        }

    }
}