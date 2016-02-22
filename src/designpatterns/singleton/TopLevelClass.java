package designpatterns.singleton;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:16:26
 */
// �Ե�һ��static��һЩ����
// java����������һ�������涨�徲̬�ࡣ�����ڲ��ࣨnested class����
// ��nested class�������������ⲿ�ࡣ
// ��java�У����ǲ�����static���ζ����ࣨtop level class����
// ֻ���ڲ������Ϊstatic��
public class TopLevelClass {
	public static class SingletonTwo {
		// ���Լ��ڲ������Լ���һ��ʵ����ֻ���ڲ�����
		private static final SingletonTwo instance = new SingletonTwo();

		private SingletonTwo() {
			// do something
		}

		// �����ṩ��һ�����ⲿ���ʱ�class�ľ�̬����������ֱ�ӷ���
		public static SingletonTwo getInstance() {
			return instance;
		}
	}

	/**
	 * ���ģʽ��ͬ�������·���if�ڲ��������ִ�е�Ч�ʣ�����ÿ�λ� ȡ����ʱ������ͬ����ֻ�е�һ�β�ͬ�����������Ժ��û��Ҫ�ˡ�
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