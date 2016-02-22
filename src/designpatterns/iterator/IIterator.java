package designpatterns.iterator;

/**
 * �����ӿ�
 * 
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:13:46
 */
public interface IIterator {
	/**
	 * �Ƿ�����һ��
	 * @return
	 */
	public boolean hasNext();
	
	/**
	 * ��һ��Ԫ�� 
	 * @return
	 */
	public Object next();
}
