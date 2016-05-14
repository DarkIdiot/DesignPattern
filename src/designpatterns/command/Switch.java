package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * The Invoker class
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:40:38
 */  // in this example, suppose you use a switch to control computer
public class Switch {
	private List<Command> history = new ArrayList<Command>();

	public Switch() {
	}

	public void storeAndExecute(Command command) {
		this.history.add(command); // optional, can do the execute only!
		command.execute();
	}
}
