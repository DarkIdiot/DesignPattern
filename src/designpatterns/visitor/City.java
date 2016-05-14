package designpatterns.visitor;

import java.util.ArrayList;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:33:31
 */
class City implements Element {
	 
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