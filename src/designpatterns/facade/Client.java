package designpatterns.facade;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:29:33
 */
public class Client {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.run();
	}
}
