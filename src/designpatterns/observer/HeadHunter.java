package designpatterns.observer;

import java.util.ArrayList;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:19:03
 */
public class HeadHunter implements Subject {

	// define a list of users, such as Mike, Bill, etc.
	private ArrayList<Observer> userList;
	private ArrayList<String> jobs;

	public HeadHunter() {
		userList = new ArrayList<Observer>();
		jobs = new ArrayList<String>();
	}

	@Override
	public void registerObserver(Observer o) {
		userList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		userList.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer o : userList) {
			o.update(this);
		}
	}

	public void addJob(String job) {
		this.jobs.add(job);
		notifyAllObservers();
	}

	public ArrayList<String> getJobs() {
		return jobs;
	}

	public String toString() {
		return jobs.toString();
	}

}
