package designpatterns.observer;

import java.util.ArrayList;

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

class HeadHunter implements Subject {

    // define a list of users, such as Mike, Bill, etc.
    private ArrayList<Observer> userList;
    private ArrayList<String> jobs;

    public HeadHunter() {
        userList = new ArrayList<>();
        jobs = new ArrayList<>();
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

class JobSeeker implements Observer {

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

interface Observer {
    void update(Subject s);
}

interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyAllObservers();
}
