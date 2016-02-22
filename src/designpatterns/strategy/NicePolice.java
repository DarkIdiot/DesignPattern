package designpatterns.strategy;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:53:31
 */
public class NicePolice implements Strategy {

	@Override
	public void processSpeeding(int speed) {
		System.out.println("This is your first time, be sure don't do it again!");
		System.out.println("Speed is "+speed);
	}
}
