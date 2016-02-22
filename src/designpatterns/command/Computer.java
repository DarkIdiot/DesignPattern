package designpatterns.command;

/**
 * The Receiver class
 * 
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:42:12
 */
public class Computer {
	public void shutDown() {
		System.out.println("computer is shut down");
	}

	public void restart() {
		System.out.println("computer is restarted");
	}
}
