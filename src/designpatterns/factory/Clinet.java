package designpatterns.factory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:03:49
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
