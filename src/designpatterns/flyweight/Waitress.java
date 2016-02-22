package designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:50:17
 */
public class Waitress {
	// coffee array
	public static List<ICoffee> coffees = new ArrayList<ICoffee>();
	// table array
	public static List<CoffeeContext> tables = new ArrayList<CoffeeContext>();
	public static int ordersCount = 0;
	private static CoffeeFactory coffeeFactory;

	/**
	 * 处理订单
	 * 
	 * @param flavorIn
	 * @param table
	 */
	public static void takeOrder(String flavorIn, int table) {
		coffees.add(coffeeFactory.getCoffeeFlavor(flavorIn));
		tables.add(new CoffeeContext(table));
		ordersCount++;
	}

	public static void takeOrder(int table, String... flavorsIn) {
		tables.add(new CoffeeContext(table));
		coffees.add(coffeeFactory.getCoffeeFlavors(flavorsIn));
		ordersCount++;
	}

	public static void main(String[] args) {
		coffeeFactory = new CoffeeFactory();

		takeOrder("Cappuccino", 2);
		takeOrder("Cappuccino", 2);
		takeOrder("Regular Coffee", 1);
		takeOrder("Regular Coffee", 2);
		takeOrder("Regular Coffee", 3);
		takeOrder("Regular Coffee", 4);
		takeOrder("Cappuccino", 4);
		takeOrder("Cappuccino", 5);
		takeOrder("Regular Coffee", 3);
		takeOrder("Cappuccino", 3);
		takeOrder(6, "Cappuccino", "Latte", "Cafe Noir"     );
		
		for (int i = 0; i < ordersCount; ++i) {
			coffees.get(i).serveCoffee(tables.get(i));
		}

		System.out.println("\nTotal Coffee objects made: "
				+ coffeeFactory.getTotalCoffeeFlavorsMade());
	}
}
