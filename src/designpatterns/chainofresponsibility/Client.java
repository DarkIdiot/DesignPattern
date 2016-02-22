package designpatterns.chainofresponsibility;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:05:11
 */
public class Client {
	public static void main(String[] args) {
		Chain chain = ChainOfResponsibility.createChain();

		chain.message("level 3", Chain.Three);

		chain.message("level 2", Chain.Two);

		chain.message("level 1", Chain.One);
	}
}
