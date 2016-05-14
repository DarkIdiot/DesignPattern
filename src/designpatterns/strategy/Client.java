package designpatterns.strategy;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:00:31
 */
public class Client {
	public static void main(String args[]) {
		HardPolice hp = new HardPolice();
		NicePolice ep = new NicePolice();

		// In situation 1, a hard officer is met
		// In situation 2, a nice officer is met
		Situation s1 = new Situation(hp);
		Situation s2 = new Situation(ep);

		// the result based on the kind of police officer.
		s1.handleByPolice(10);
		s2.handleByPolice(10);
	}
}
