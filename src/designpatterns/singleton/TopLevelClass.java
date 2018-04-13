package designpatterns.singleton;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:16:26
 */
// 对第一行static的一些解释
// java允许我们在一个类里面定义静态类。比如内部类（nested class）。
// 把nested class封闭起来的类叫外部类。
// 在java中，我们不能用static修饰顶级类（top level class）。
// 只有内部类可以为static。
public class TopLevelClass {
    public static class SingletonTwo {
        // 在自己内部定义自己的一个实例，只供内部调用
        private static final SingletonTwo instance = new SingletonTwo();

        private SingletonTwo() {
            // do something
        }

        // 这里提供了一个供外部访问本class的静态方法，可以直接访问
        public static SingletonTwo getInstance() {
            return instance;
        }
    }

    /**
     * 这个模式将同步内容下方到if内部，提高了执行的效率，不必每次获 取对象时都进行同步，只有第一次才同步，创建了以后就没必要了。
     */
    public static class SingletonOne {
        private static SingletonOne instance = null;

        private SingletonOne() {
            // do something
        }

        public static SingletonOne getInstance() {
            if (instance == null) {
                synchronized (SingletonOne.class) {
                    if (null == instance) {
                        instance = new SingletonOne();
                    }
                }
            }
            return instance;
        }
    }

}

class Singleton {
    private static Singleton instance = null;

    /**
     * 同时只能有一个线程来获取单利
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }
}

class SingletonClass {
    private static SingletonClass instance = null;

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    private SingletonClass() {
    }
}
