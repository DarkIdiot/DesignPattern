package designpatterns.bridge;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:45:56
 */
public abstract class AbstractRemoteControl {

	private ITV tv;

	public AbstractRemoteControl(ITV tv) {
		this.tv = tv;
	}

	public void turnOn() {
		tv.on();
	}

	public void turnOff() {
		tv.off();
	}

	public void setChannel(int channel) {
		tv.switchChannel(channel);
	}
}
