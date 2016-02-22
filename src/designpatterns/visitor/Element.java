package designpatterns.visitor;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:15:15
 */
public interface Element {
	public void accept(Visitor visitor);
}
