package designpatterns.factory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:03:49
 */
public class Clinet {
	public static void main(String[] args) {
		Human boy = HumanFactory.createHuman("boy");
		boy.Talk();
		boy.Walk();
		Human girl = HumanFactory.createHuman("girl");
		girl.Talk();
		girl.Walk();
	}
}
