package designpatterns.factory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:03:23
 */
public class HumanFactory {
	public static Human createHuman(String m) {
		Human p = null;
		if (m == "boy") {
			p = new Boy();
		} else if (m == "girl") {
			p = new Girl();
		}

		return p;
	}
}
