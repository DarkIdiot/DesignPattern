package designpatterns.visitor;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:14:24
 */
public interface Visitor {
	public void visit(City city);

	public void visit(Museum museum);

	public void visit(Park park);
}
