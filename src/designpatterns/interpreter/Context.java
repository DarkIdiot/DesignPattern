package designpatterns.interpreter;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:18:37
 */
public class Context {

	private String input;
	private String output;

	public Context(String input) {
		this.input = input;
		this.output = "";
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
}
