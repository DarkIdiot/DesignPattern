package designpatterns.bridge;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:45:23
 */
public class SonyTV implements ITV {
	@Override
	public void on() {
		System.out.println("Sony is turned on.");
	}

	@Override
	public void off() {
		System.out.println("Sony is turned off.");
	}

	@Override
	public void switchChannel(int channel) {
		System.out.println("Sony: channel - " + channel);
	}
}
