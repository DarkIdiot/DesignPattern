package designpatterns.abstractfactory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����10:35:09
 */
public class Computer {
	private CPU cpu;
	 
    public Computer(CPUFactory factory) {
        cpu = factory.produceCPU();
        cpu.process();
    }
}
