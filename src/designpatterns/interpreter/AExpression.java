package designpatterns.interpreter;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:19:29
 */
public class AExpression extends Expression {
	public void interpret(Context context) {
		System.out.println("a expression");
		String input = context.getInput();

		context.setInput(input.substring(1));
		context.setOutput(context.getOutput() + "1");
	}

}
