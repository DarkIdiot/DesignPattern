package designpatterns.proxyagent;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:33:18
 */
public class Client {
	public static void main(String[] args) {
		BusinessAgent businessAgent = new BusinessAgent();
		businessAgent.seduceMan();
		businessAgent.happyWithMan();
	}
}
