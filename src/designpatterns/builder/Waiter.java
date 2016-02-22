package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:05:54
 */
// ָ����η�װbuilder
public class Waiter {
	private StarbucksBuilder starbucksBuilder;

	public void setStarbucksBuilder(StarbucksBuilder builder) {
		starbucksBuilder = builder;
	}

	public Starbucks getstarbucksDrink() {
		return starbucksBuilder.getStarbucks();
	}

	public void constructStarbucks() {
		starbucksBuilder.createStarbucks();
		starbucksBuilder.buildDrink();
		starbucksBuilder.buildSize();
	}
}
