package designpattern.proxy;

/**
 * 代理模式
 */
public class ProxyClient {
    public static void main(String[] args) {
        //静态代理
        Server staticProxyServer = new ServerStaticProxy();
        System.out.println(staticProxyServer.response());

        //动态代理
        ServerDynamicProxyHandler dpshandler = new ServerDynamicProxyHandler(new ApplicationServer());
        Server dynamicProxyServer = dpshandler.getProxyServer();
        System.out.println(dynamicProxyServer.response());
    }
}