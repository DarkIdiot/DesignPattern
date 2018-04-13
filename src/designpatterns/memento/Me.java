package designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:22:13
 */
public class Me {
    public static void main(String[] args) {
        List<Memento> savedTimes = new ArrayList<Memento>();

        Life life = new Life();

        // time travel and record the eras
        life.set("2000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("3000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("4000 A.D.");

        life.restoreFromMemento(savedTimes.get(0));

    }
}

class Memento {
    private final String time;

    public Memento(String timeToSave) {
        time = timeToSave;
    }

    public String getSavedTime() {
        return time;
    }
}

class Life {
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
