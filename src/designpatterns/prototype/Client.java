package designpatterns.prototype;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:11:29
 */
public class Client {
	public static void main(String args[]) throws CloneNotSupportedException {
		ConcreteObject a = new ConcreteObject(1);

		for (int i = 2; i < 10; i++) {
			Prototype temp = a.clone();
			temp.setSize(i);
			temp.printSize();
		}
	}
}
