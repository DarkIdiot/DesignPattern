package designpatterns.proxyagent;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:33:18
 */
public class Client {
	public static void main(String[] args) {
		BusinessAgent businessAgent = new BusinessAgent();
		businessAgent.seduceMan();
		businessAgent.happyWithMan();
	}
}
