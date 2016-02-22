package designpatterns.abstractfactory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:32:50
 */
public class IntelFactory implements CPUFactory {
	@Override
	public CPU produceCPU() {
		return new IntelCPU();
	}
}
