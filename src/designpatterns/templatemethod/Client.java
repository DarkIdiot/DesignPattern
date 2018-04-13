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

abstract class AbstractClass
{
	// 一些抽象行为，放到子类去实现
	public abstract void PrimitiveOperation1();
	public abstract void PrimitiveOperation2();

	// 模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，它们推迟到子类去实现。
	public void TemplateMethod()
	{
		PrimitiveOperation1();
		PrimitiveOperation2();
		System.out.println("Done the method.");
	}
}

class ConcreteClassA extends AbstractClass {
    // 与ConcreteClassB中的实现逻辑不同
    @Override
    public void PrimitiveOperation1() {
        System.out.println("Implement operation 1 in Concreate class A.");
    }

    // 与ConcreteClassB中的实现逻辑不同
    @Override
    public void PrimitiveOperation2() {
        System.out.println("Implement operation 2 in Concreate class A.");
    }
}

class ConcreteClassB extends AbstractClass {
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
