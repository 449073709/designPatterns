package designpattern.responsibilitychain;

public abstract class Handler {

    public Handler next;

    public abstract void handleRequest(String value);

    public void setNext(Handler next) {
        this.next = next;
    }

}

//具体类-村级处理人
class VillageHandler extends Handler {

    @Override
    public void handleRequest(String value) {
        if ("village".equals(value)) {
            System.out.println("VillageHandler: handled~");
        } else {
            System.out.println("VillageHandler: pass~");
            this.next.handleRequest(value);
        }
    }

}

//具体类-镇级处理人
class TownHandler extends Handler {

    @Override
    public void handleRequest(String value) {
        if ("town".equals(value)) {
            System.out.println("TownHandler: handled~");
        } else {
            System.out.println("TownHandler: pass~");
            this.next.handleRequest(value);
        }
    }
}

//具体类-县级处理人
class CountyHandler extends Handler {

    @Override
    public void handleRequest(String value) {
        if ("county".equals(value)) {
            System.out.println("County: handled~");
        } else if (this.next == null) {
            System.out
                    .println("no next Handler, this request can not be handle~");
        } else {
            System.out.println("County: pass~");
            this.next.handleRequest(value);
        }
    }
}