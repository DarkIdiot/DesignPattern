package designpatterns.memento;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:21:36
 */
public class Life {
	private String time;

	public void set(String time) {
		System.out.println("Setting time to " + time);
		this.time = time;
	}

	public Memento saveToMemento() {
		System.out.println("Saving time to Memento");
		return new Memento(time);
	}

	public void restoreFromMemento(Memento memento) {
		time = memento.getSavedTime();
		System.out.println("Time restored from Memento: " + time);
	}
}
