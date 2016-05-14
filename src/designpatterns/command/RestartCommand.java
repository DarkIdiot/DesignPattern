package designpatterns.command;

/**
 * The Command for restarting the computer
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:44:02
 */
public class RestartCommand implements Command {

	private Computer computer;

	public RestartCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.restart();
	}
}
