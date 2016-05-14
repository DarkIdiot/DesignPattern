package designpatterns.factory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:02:47
 */
public class Girl implements Human {

	@Override
	public void Talk() {
		System.out.println("Girl is talking...");
	}

	@Override
	public void Walk() {
		System.out.println("Girl is walking...");
	}
}
