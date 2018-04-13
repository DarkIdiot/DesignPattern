package designpatterns.adapter;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:39:03
 */
public class Client {
    public static void main(String[] args) {
        // 对客户端来说，调用的就是Target的Request()
        Target target = new Adapter();
        target.Request();
    }
}

class Adaptee {
    public void SpecificRequest() {
        System.out.println("This is a special request.");
    }
}

class Adapter extends Target {
    // 建立一个私有的Adeptee对象
    private Adaptee adaptee = new Adaptee();

    /**
     * 通过重写，表面上调用Request()方法，变成了实际调用SpecificRequest()
     */
    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}

abstract class Target {
    /// 使用abstract修饰以便子类可以重写
    public abstract void Request();
}
