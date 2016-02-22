package designpatterns.templatemethod;

/**
 * 具体类，实现了抽象类中的特定步骤
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:33:31
 */
public class ConcreteClassB extends AbstractClass {
	// 与ConcreteClassA中的实现逻辑不同
	@Override
	public void PrimitiveOperation1() {
		System.out.println("Implement operation 1 in Concreate class B.");
	}

	// 与ConcreteClassA中的实现逻辑不同
	@Override
	public void PrimitiveOperation2() {
		System.out.println("Implement operation 2 in Concreate class B.");
	}
}
