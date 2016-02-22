package designpatterns.composite;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:25:54
 */
public class Leaf implements Component {
	String name;
	public Leaf(String s){
		name = s;
	}
    public void show() {
        System.out.println(name);
    }
}
