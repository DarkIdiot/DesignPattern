package designpatterns.chainofresponsibility;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:02:21
 */
public class A extends Chain {
	public A(int threshold) {
		this.Threshold = threshold;
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println("A: " + msg);
	}
}