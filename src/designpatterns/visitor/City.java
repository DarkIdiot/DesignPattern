package designpatterns.visitor;

import java.util.ArrayList;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:15:40
 */
public class City implements Element {

	ArrayList<Element> places = new ArrayList<Element>();

	public City() {
		places.add(new Museum());
		places.add(new Park());
	}

	@Override
	public void accept(Visitor visitor) {
		System.out.println("City is accepting visitor.");
		visitor.visit(this);

		for (Element e : places) {
			e.accept(visitor);
		}
	}
}
