package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:04:50
 */
// 泡咖啡builder
public class CoffeeBuilder extends StarbucksBuilder {
	public void buildSize() {
		starbucks.setSize("medium");
		System.out.println("build medium size");
	}

	public void buildDrink() {
		starbucks.setDrink("coffee");
		System.out.println("build coffee");
	}
}
