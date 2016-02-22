package designpatterns.singleton;

/**
 * 懒汉式，也是常用的形式。
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:12:22
 */
public class Singleton {
	private static Singleton instance = null;
	/**
	 * 同时只能有一个线程来获取单利
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
