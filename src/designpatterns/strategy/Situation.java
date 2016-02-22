package designpatterns.strategy;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:00:11
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
