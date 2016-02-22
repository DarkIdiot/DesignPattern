package designpatterns.singleton;

/**
 * ����ʽ��Ҳ�ǳ��õ���ʽ��
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:12:22
 */
public class Singleton {
	private static Singleton instance = null;
	/**
	 * ͬʱֻ����һ���߳�����ȡ����
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
