package designpatterns.facade;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:29:06
 */
public class Computer {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;

	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}

	public void run() {
		cpu.processData();
		memory.load();
		hardDrive.readdata();
	}
}
