package designpatterns.visitor;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:14:24
 */
public interface Visitor {
	public void visit(City city);

	public void visit(Museum museum);

	public void visit(Park park);
}
