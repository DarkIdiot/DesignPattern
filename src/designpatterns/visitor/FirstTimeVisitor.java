package designpatterns.visitor;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:14:48
 */
public class FirstTimeVisitor implements Visitor {

	@Override
	public void visit(City city) {
		System.out.println("I'm visiting the city!");
	}

	@Override
	public void visit(Museum museum) {
		System.out.println("I'm visiting the Museum!");
	}

	@Override
	public void visit(Park park) {
		System.out.println("I'm visiting the Park!");
	}
}
