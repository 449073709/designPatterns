package designpattern.bridge.demo;

public class Client {
    public static void main(String[] args) {

	Phone a = new Xiaomi();
	//选择游戏应用
	a.setSoft(new GameSoft());
	a.runSoft();
	//选择通讯录应用
	a.setSoft(new AddressListSoft());
	a.runSoft();

	Phone b = new IPhone();
	b.setSoft(new GameSoft());
	b.runSoft();
	b.setSoft(new AddressListSoft());
	b.runSoft();

    }

}