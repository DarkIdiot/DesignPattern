package designpatterns.iterator;

/**
 * �����ӿ�
 * 
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:14:10
 */
public interface IContainer {
	
	/**
	 * ���ɵ������ӿ�
	 * @return
	 */
	public IIterator createIterator();
}
