package designpatterns.state;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:49:08
 */
public class Poor implements State {

	@Override
	public void saySomething(StateContext sc) {
		System.out.println("I'm poor currently, and spend much time working.");
		sc.changeState(new Rich());
	}

}
