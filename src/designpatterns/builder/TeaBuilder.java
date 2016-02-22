package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:04:16
 */
//�ݲ�builder
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

