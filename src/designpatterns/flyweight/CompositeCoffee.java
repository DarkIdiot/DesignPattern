package designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ���ӵ���Ԫ
 * 
 * @author idiot
 * @version 1.0
 * @date 2016��1��4�� ����9:05:45
 */
public class CompositeCoffee implements ICoffee {
	
	private Map<String, ICoffee> coffees = new HashMap<>();
	
	public void add(String flavor , ICoffee coffee){
		coffees.put(flavor, coffee);
	}
	
	
	/**
	 * ����״̬��Ϊ�������뵽������
	 */
	@Override
	public void serveCoffee(CoffeeContext context) {
		for (Entry<String, ICoffee> coffee : coffees.entrySet()) {
			System.out.println("Serving " + coffee.getKey() + " to table "
					+ context.getTable());
		}
		
	}
}
