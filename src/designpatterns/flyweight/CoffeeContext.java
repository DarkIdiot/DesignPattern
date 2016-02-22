package designpatterns.flyweight;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:49:31
 */
public class CoffeeContext {
	private final int tableNumber;

	public CoffeeContext(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getTable() {
		return this.tableNumber;
	}
}