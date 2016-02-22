package designpatterns.observer;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:20:49
 */
public class Client {
	public static void main(String[] args) {
		HeadHunter hh = new HeadHunter();
		hh.registerObserver(new JobSeeker("Mike"));
		hh.registerObserver(new JobSeeker("Chris"));
		hh.registerObserver(new JobSeeker("Jeff"));

		// ÿ�����һ����job�������ҹ����˶����Եõ�֪ͨ��
		hh.addJob("Google Job");
		hh.addJob("Yahoo Job");
	}
}
