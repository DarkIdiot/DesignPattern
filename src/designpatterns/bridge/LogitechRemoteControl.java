package designpatterns.bridge;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:46:56
 */
public class LogitechRemoteControl extends AbstractRemoteControl {

	public LogitechRemoteControl(ITV tv) {
		super(tv);
	}

	public void setChannelKeyboard(int channel) {
		setChannel(channel);
		System.out.println("Logitech use keyword to set channel.");
	}
}
