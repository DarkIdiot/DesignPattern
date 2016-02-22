package designpatterns.factory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:02:13
 */
public class Boy implements Human {

	@Override
	public void Talk() {
		System.out.println("Boy is talking...");
	}

	@Override
	public void Walk() {
		System.out.println("Boy is walking...");
	}

}
