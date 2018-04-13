package designpatterns.facade;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:29:33
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
    }
}

class Computer {
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
        hardDrive.readData();
    }
}

class CPU {
    public void processData() {
    }
}

class HardDrive {
    public void readData() {
    }
}

class Memory {
    public void load() {
    }
}
