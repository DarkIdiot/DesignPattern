package designpatterns.decorator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:42:17
 */
public class Science extends GirlDecorator {

	private Girl girl;

	public Science(Girl g) {
		girl = g;
	}

	@Override
	public String getDescription() {
		return girl.getDescription() + "+Like Science";
	}

	public void caltulateStuff() {
		System.out.println("scientific calculation!");
	}
}
