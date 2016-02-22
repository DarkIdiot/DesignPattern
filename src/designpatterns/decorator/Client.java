package designpatterns.decorator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:43:10
 */
public class Client {
	public static void main(String[] args) {
		Girl g1 = new AmericanGirl();
		System.out.println(g1.getDescription());

		Science g2 = new Science(g1);
		System.out.println(g2.getDescription());

		Art g3 = new Art(g2);
		System.out.println(g3.getDescription());
	}
}
