package designpatterns.mediator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:13:11
 */
public class Client {
	public static void main(String[] args) {
		IMediator mediator = new ConcreteMediator();

		ColleagueA talkColleague = new ColleagueA(mediator);
		ColleagueB fightColleague = new ColleagueB(mediator);

		talkColleague.doSomething();
		fightColleague.doSomething();
	}
}
