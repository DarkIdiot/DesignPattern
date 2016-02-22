package designpatterns.strategy;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:54:43
 */
public class HardPolice implements Strategy {

	@Override
	public void processSpeeding(int speed) {
		System.out.println("Your speed is " + speed
				+ ", and should get a ticket!");
	}
}
