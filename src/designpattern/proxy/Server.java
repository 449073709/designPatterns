package designpattern.proxy;

//服务器接口
public interface Server {

    String response();
}

//具体类-被代理服务器类
class ApplicationServer implements Server {

    @Override
    public String response() {
        return "response from ApplicationServers";
    }

}