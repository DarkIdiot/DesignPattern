package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:03:23
 */
//����builder
public abstract class StarbucksBuilder {
	protected Starbucks starbucks;

	public Starbucks getStarbucks() {
		return starbucks;
	}

	public void createStarbucks() {
		starbucks = new Starbucks();
		System.out.println("a drink is created");
	}

	public abstract void buildSize();

	public abstract void buildDrink();
}
