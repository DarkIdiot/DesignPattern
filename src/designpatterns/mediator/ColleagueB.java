package designpatterns.mediator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:12:47
 */
public class ColleagueB extends Colleague {
	public ColleagueB(IMediator mediator) {
		this.mediator = mediator;
		this.mediator.registerB(this);
	}

	@Override
	public void doSomething() {
		this.mediator.fight();
	}
}
