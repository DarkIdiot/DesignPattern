package designpatterns.abstractfactory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:32:50
 */
public class IntelFactory implements CPUFactory {
	@Override
	public CPU produceCPU() {
		return new IntelCPU();
	}
}
