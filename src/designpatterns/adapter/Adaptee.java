package designpatterns.adapter;

/**
 * 定义需要适配的类
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:36:41
 */
public class Adaptee {
	public void SpecificRequest() {
		System.out.println("This is a special request.");
	}
}
