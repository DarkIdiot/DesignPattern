package designpatterns.flyweight;

/**
 * Concrete Flyweight object
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:48:57
 */
public class Coffee implements ICoffee {
	private final String flavor;

	public Coffee(String newFlavor) {
		this.flavor = newFlavor;
		System.out.println("Coffee is created! - " + flavor);
	}

	public String getFlavor() {
		return this.flavor;
	}

	public void serveCoffee(CoffeeContext context) {
		System.out.println("Serving " + flavor + " to table "
				+ context.getTable());
	}
}
