package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:04:50
 */
// �ݿ���builder
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
