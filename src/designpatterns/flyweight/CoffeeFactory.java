package designpatterns.flyweight;

import java.util.HashMap;

/**
 * 工厂类
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:49:56
 */
public class CoffeeFactory {
	private HashMap<String, Coffee> flavors = new HashMap<String, Coffee>();
	/**
	 * 单纯享元工厂方法
	 * 
	 * @param flavorName
	 * @return
	 */
	public ICoffee getCoffeeFlavor(String flavorName) {
		Coffee flavor = flavors.get(flavorName);
		if (flavor == null) {
			flavor = new Coffee(flavorName);
			flavors.put(flavorName, flavor);
		}
		return flavor;
	}
	/**
	 * 复合享元工厂方法
	 * 
	 * @param flavorName
	 * @return
	 */
	public ICoffee getCoffeeFlavors(String... flavorNames){
		CompositeCoffee compositeCoffee = new CompositeCoffee();
		for (String flavorName : flavorNames) {
			compositeCoffee.add(flavorName, this.getCoffeeFlavor(flavorName));
		}
		return compositeCoffee; 
	}
	
	public int getTotalCoffeeFlavorsMade() {
		return flavors.size();
	}
}
