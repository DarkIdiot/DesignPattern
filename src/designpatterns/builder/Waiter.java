package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:05:54
 */
// 指导如何封装builder
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
