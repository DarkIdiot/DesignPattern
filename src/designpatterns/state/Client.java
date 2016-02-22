package designpatterns.state;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:50:17
 */
public class Client {
	public static void main(String[] args) {
		StateContext sc = new StateContext();
		sc.saySomething();
		sc.saySomething();
		sc.saySomething();
		sc.saySomething();
	}
}
