package designpatterns.templatemethod;

/**
 * �����࣬ʵ���˳������е��ض�����
 * 
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:33:31
 */
public class ConcreteClassA extends AbstractClass {
	// ��ConcreteClassB�е�ʵ���߼���ͬ
	@Override
	public void PrimitiveOperation1() {
		System.out.println("Implement operation 1 in Concreate class A.");
	}

	// ��ConcreteClassB�е�ʵ���߼���ͬ
	@Override
	public void PrimitiveOperation2() {
		System.out.println("Implement operation 2 in Concreate class A.");
	}
}
