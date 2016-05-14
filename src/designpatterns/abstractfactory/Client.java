package designpatterns.abstractfactory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:35:39
 */
public class Client {
	public static void main(String[] args) {
		new Computer(createSpecificFactory());
	}

	public static CPUFactory createSpecificFactory() {
		int sys = 1; // 基于特定要求
		if (sys == 0)
			return new AMDFactory();
		else
			return new IntelFactory();
	}
}