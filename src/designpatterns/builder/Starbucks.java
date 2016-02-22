package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:02:37
 */
//待构建产品
public class Starbucks {
	private String size;
	private String drink;

	public void setSize(String size) {
		this.size = size;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}
}
