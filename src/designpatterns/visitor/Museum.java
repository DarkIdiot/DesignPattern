package designpatterns.visitor;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:16:14
 */
public class Museum implements Element {
	@Override
	public void accept(Visitor visitor) {
		System.out.println("Museum is accepting visitor.");
		visitor.visit(this);
	}
}
