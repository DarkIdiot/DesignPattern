package designpatterns.bridge;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:47:20
 */
public class Client {
	public static void main(String[] args) {
		ITV tv = new SonyTV();
		LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
		lrc.setChannelKeyboard(100);
	}
}
