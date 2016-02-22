package designpatterns.observer;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:17:35
 */
public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyAllObservers();
}
