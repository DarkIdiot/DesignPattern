package designpatterns.mediator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:10:46
 */
public interface IMediator {
	public void fight();

	public void talk();

	public void registerA(ColleagueA a);

	public void registerB(ColleagueB a);
}
