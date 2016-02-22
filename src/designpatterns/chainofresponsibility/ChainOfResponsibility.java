package designpatterns.chainofresponsibility;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:04:36
 */
public class ChainOfResponsibility {
	public static Chain createChain() {
		// Build the chain of responsibility

		Chain chain1 = new A(Chain.Three);

		Chain chain2 = new B(Chain.Two);
		chain1.setNext(chain2);

		Chain chain3 = new C(Chain.One);
		chain2.setNext(chain3);

		return chain1;
	}
}
