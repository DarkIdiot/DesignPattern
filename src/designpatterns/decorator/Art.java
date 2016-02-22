package designpatterns.decorator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:42:44
 */
public class Art extends GirlDecorator {

	private Girl girl;

	public Art(Girl g) {
		girl = g;
	}

	@Override
	public String getDescription() {
		return girl.getDescription() + "+Like Art";
	}

	public void draw() {
		System.out.println("draw pictures!");
	}
}
