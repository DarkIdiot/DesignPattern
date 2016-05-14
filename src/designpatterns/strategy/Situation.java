package designpatterns.strategy;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:00:11
 */
public class Situation {
	private Strategy strategy;

	public Situation(Strategy strategy) {
		this.strategy = strategy;
	}

	public void handleByPolice(int speed) {
		this.strategy.processSpeeding(speed);
	}
}
