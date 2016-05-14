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
