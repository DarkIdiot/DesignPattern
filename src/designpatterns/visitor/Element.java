package designpatterns.visitor;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:15:15
 */
public interface Element {
	public void accept(Visitor visitor);
}
