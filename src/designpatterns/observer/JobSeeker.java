package designpatterns.observer;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:20:19
 */
public class JobSeeker implements Observer {

	private String name;

	public JobSeeker(String name) {
		this.name = name;
	}

	@Override
	public void update(Subject s) {
		System.out.println(this.name + " got notified!");
		// print job list
		System.out.println(s);
	}
}
