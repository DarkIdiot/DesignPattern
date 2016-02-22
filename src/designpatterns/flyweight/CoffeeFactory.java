package designpatterns.flyweight;

import java.util.HashMap;

/**
 * ������
 * 
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:49:56
 */
public class CoffeeFactory {
	private HashMap<String, Coffee> flavors = new HashMap<String, Coffee>();
	/**
	 * ������Ԫ��������
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
	 * ������Ԫ��������
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
