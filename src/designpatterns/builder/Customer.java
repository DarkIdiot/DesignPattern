package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午5:18:31
 */

// 客户
public class Customer {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		StarbucksBuilder coffeeBuilder = new CoffeeBuilder();

		// 也可以用泡茶builder沏茶
		StarbucksBuilder teaBuilder = new TeaBuilder();

		waiter.setStarbucksBuilder(coffeeBuilder);
		waiter.constructStarbucks();

		// 取到饮料
		Starbucks drink = waiter.getstarbucksDrink();

	}
}