package designpatterns.visitor;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:17:11
 */
public class Client {
	public static void main(String[] args) {
		FirstTimeVisitor visitor = new FirstTimeVisitor();
		City city = new City();
		city.accept(visitor);
	}
}
