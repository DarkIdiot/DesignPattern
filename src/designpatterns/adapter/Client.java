package designpatterns.adapter;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:39:03
 */
public class Client {
	public static void main(String[] args) {
		 // �Կͻ�����˵�����õľ���Target��Request()
        Target target = new Adapter();
        target.Request();
	}
	
}
