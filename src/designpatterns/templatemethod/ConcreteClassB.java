package designpatterns.templatemethod;

/**
 * �����࣬ʵ���˳������е��ض�����
 * 
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:33:31
 */
public class ConcreteClassB extends AbstractClass {
	// ��ConcreteClassA�е�ʵ���߼���ͬ
	@Override
	public void PrimitiveOperation1() {
		System.out.println("Implement operation 1 in Concreate class B.");
	}

	// ��ConcreteClassA�е�ʵ���߼���ͬ
	@Override
	public void PrimitiveOperation2() {
		System.out.println("Implement operation 2 in Concreate class B.");
	}
}
