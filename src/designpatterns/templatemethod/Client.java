package designpatterns.templatemethod;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:37:23
 */
public class Client {
	public static void main(String[] args) {
		// ����������
		AbstractClass c;

		// ��ConcreteClassAʵ����c
		c = new ConcreteClassA();
		c.TemplateMethod();

		// ��ConcreteClassBʵ����c
		c = new ConcreteClassB();
		c.TemplateMethod();

	}
}
