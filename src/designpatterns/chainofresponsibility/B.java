package designpatterns.chainofresponsibility;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:02:48
 */
public class B extends Chain {
	public B(int threshold) {
		this.Threshold = threshold;
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println("B: " + msg);
	}
}
