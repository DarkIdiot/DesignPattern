package designpatterns.composite;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:25:54
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
