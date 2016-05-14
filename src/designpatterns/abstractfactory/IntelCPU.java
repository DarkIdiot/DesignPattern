package designpatterns.abstractfactory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:34:36
 */
public class IntelCPU implements CPU {

	@Override
	public void process() {
		System.out.println("Intel is processing...");
	}

}
