package designpatterns.abstractfactory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:33:57
 */
public class AMDCPU implements CPU {

	@Override
	public void process() {
		System.out.println("AMD is processing...");
	}

}
