package designpatterns.observer;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:20:49
 */
public class Client {
	public static void main(String[] args) {
		HeadHunter hh = new HeadHunter();
		hh.registerObserver(new JobSeeker("Mike"));
		hh.registerObserver(new JobSeeker("Chris"));
		hh.registerObserver(new JobSeeker("Jeff"));

		// 每次添加一个个job，所有找工作人都可以得到通知。
		hh.addJob("Google Job");
		hh.addJob("Yahoo Job");
	}
}
