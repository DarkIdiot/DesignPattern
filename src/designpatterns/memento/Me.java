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
