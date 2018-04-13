package designpatterns.prototype;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:11:29
 */
public class Client {
    public static void main(String args[]) throws CloneNotSupportedException {
        ConcreteObject a = new ConcreteObject(1);

        for (int i = 2; i < 10; i++) {
            Prototype temp = a.clone();
            temp.setSize(i);
            temp.printSize();
        }
    }
}

interface Prototype {
    void setSize(int x);

    void printSize();
}

class ConcreteObject implements Prototype, Cloneable {

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