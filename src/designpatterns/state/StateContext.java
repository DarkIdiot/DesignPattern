package designpatterns.state;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:47:49
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
