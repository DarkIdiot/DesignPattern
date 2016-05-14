package designpatterns.iterator;

/**
 * 容器接口
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:14:10
 */
public interface IContainer {
	
	/**
	 * 生成迭代器接口
	 * @return
	 */
	public IIterator createIterator();
}
