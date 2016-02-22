package designpatterns.state;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:48:25
 */
public class Rich implements State {

	@Override
	public void saySomething(StateContext sc) {
		System.out.println("I'm rick currently, and play a lot.");
		sc.changeState(new Poor());
	}

}
