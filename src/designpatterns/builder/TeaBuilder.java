package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:04:16
 */
//泡茶builder
public class TeaBuilder extends StarbucksBuilder {
	public void buildSize() {
		starbucks.setSize("large");
		System.out.println("build large size");
	}

	public void buildDrink() {
		starbucks.setDrink("tea");
		System.out.println("build tea");
	}

}

