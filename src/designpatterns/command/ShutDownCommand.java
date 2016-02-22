package designpatterns.command;

/**
 * The Command for shutting down the computer
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:43:02
 */
public class ShutDownCommand implements Command {
	private Computer computer;

	public ShutDownCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.shutDown();
	}
}
