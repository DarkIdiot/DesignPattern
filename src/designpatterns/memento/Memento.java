package designpatterns.memento;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:22:54
 */
public class Memento {
	private final String time;

	public Memento(String timeToSave) {
		time = timeToSave;
	}

	public String getSavedTime() {
		return time;
	}
}
