package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:25:24
 */
public class Composite implements Component {

	private List<Component> childComponents = new ArrayList<Component>();

	public void add(Component component) {
		childComponents.add(component);
	}

	public void remove(Component component) {
		childComponents.remove(component);
	}

	@Override
	public void show() {
		for (Component component : childComponents) {
			component.show();
		}
	}
}