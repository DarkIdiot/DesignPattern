package designpatterns.command;

/**
 * The Receiver class
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:42:12
 */
public class Computer {
	public void shutDown() {
		System.out.println("computer is shut down");
	}

	public void restart() {
		System.out.println("computer is restarted");
	}
}
