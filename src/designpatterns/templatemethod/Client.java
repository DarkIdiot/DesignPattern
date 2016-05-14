package designpatterns.templatemethod;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:37:23
 */
public class Client {
	public static void main(String[] args) {
		// 声明抽象类
		AbstractClass c;

		// 用ConcreteClassA实例化c
		c = new ConcreteClassA();
		c.TemplateMethod();

		// 用ConcreteClassB实例化c
		c = new ConcreteClassB();
		c.TemplateMethod();

	}
}
