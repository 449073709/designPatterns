package designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 */
public interface Proxy {
}

//具体类-静态代理类
class ServerStaticProxy implements Server {

    private ApplicationServer appServer;

    @Override
    public String response() {
        if (null == appServer) {
            appServer = new ApplicationServer();
        }
        //before , you can do something
        String str = appServer.response() + "(by ProxyServer, static proxy.)";
        //after , you can do something
        return str;
    }

}

//具体类-动态代理类
class ServerDynamicProxyHandler implements InvocationHandler {

    private Server appServer;

    public ServerDynamicProxyHandler(Server appServer) {
        this.appServer = appServer;
    }

    //获取动态代理对象
    public Server getProxyServer() {
        return (Server) java.lang.reflect.Proxy.newProxyInstance(appServer.getClass().getClassLoader(),
                appServer.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //before , you can do something
        Object str = method.invoke(appServer, args);
        //after , you can do something
        return str.toString() + "(by ProxyServer, dynamic proxy.)";
    }

}