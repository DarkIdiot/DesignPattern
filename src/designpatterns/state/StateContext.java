package designpatterns.state;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:47:49
 */
public class StateContext {
	private State currentState;

	public StateContext() {
		currentState = new Poor();
	}

	public void changeState(State newState) {
		this.currentState = newState;
	}

	public void saySomething() {
		this.currentState.saySomething(this);
	}
}
