package designpatterns.mediator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:12:23
 */
public class ColleagueA extends Colleague {

	public ColleagueA(IMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void doSomething() {
		this.mediator.talk();
		this.mediator.registerA(this);
	}
}
