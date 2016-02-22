package designpatterns.interpreter;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:19:51
 */
public class BExpression extends Expression {
	public void interpret(Context context) {
		System.out.println("b expression");
		String input = context.getInput();

		context.setInput(input.substring(1));
		context.setOutput(context.getOutput() + "2");
	}
}
