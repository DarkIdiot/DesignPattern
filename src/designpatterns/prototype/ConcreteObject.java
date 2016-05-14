package designpatterns.prototype;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:10:01
 */
public class ConcreteObject implements Prototype, Cloneable {

	private int size;

	public ConcreteObject(int x) {
		this.size = x;
	}

	@Override
	public void setSize(int x) {
		this.size = x;
	}

	@Override
	public void printSize() {
		System.out.println("Size: " + size);
	}

	@Override
	public ConcreteObject clone() throws CloneNotSupportedException {
		return (ConcreteObject) super.clone();
	}

}
