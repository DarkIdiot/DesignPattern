package designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:20:17
 */
public class Client {
	public static void main(String[] args) {
		String str = "ab";
		Context context = new Context(str);

		List<Expression> list = new ArrayList<Expression>();
		list.add(new AExpression());
		list.add(new BExpression());

		for (Expression ex : list) {
			ex.interpret(context);

		}

		System.out.println(context.getOutput());
	}
}
