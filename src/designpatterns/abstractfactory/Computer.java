package designpatterns.abstractfactory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:35:09
 */
public class Computer {
	private CPU cpu;
	 
    public Computer(CPUFactory factory) {
        cpu = factory.produceCPU();
        cpu.process();
    }
}
