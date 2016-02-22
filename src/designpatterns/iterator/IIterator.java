package designpatterns.iterator;

/**
 * 遍历接口
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:13:46
 */
public interface IIterator {
	/**
	 * 是否还有下一个
	 * @return
	 */
	public boolean hasNext();
	
	/**
	 * 下一个元素 
	 * @return
	 */
	public Object next();
}
