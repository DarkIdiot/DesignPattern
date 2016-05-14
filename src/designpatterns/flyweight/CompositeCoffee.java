package designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 复杂的享元
 * 
 * @author idiot
 * @version 1.0
 * @date 2016年1月4日 上午9:05:45
 */
public class CompositeCoffee implements ICoffee {
	
	private Map<String, ICoffee> coffees = new HashMap<>();
	
	public void add(String flavor , ICoffee coffee){
		coffees.put(flavor, coffee);
	}
	
	
	/**
	 * 外蕴状态作为参数传入到方法中
	 */
	@Override
	public void serveCoffee(CoffeeContext context) {
		for (Entry<String, ICoffee> coffee : coffees.entrySet()) {
			System.out.println("Serving " + coffee.getKey() + " to table "
					+ context.getTable());
		}
		
	}
}
