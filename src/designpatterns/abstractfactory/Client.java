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

class Computer {
    private CPU cpu;

    public Computer(CPUFactory factory) {
        cpu = factory.produceCPU();
        cpu.process();
    }
}

interface CPU {
    void process();
}

class AMDCPU implements CPU {

    @Override
    public void process() {
        System.out.println("AMD is processing...");
    }
}

class IntelCPU implements CPU {

    @Override
    public void process() {
        System.out.println("Intel is processing...");
    }
}

interface CPUFactory {
    CPU produceCPU();
}

class AMDFactory implements CPUFactory {

    @Override
    public CPU produceCPU() {
        return new AMDCPU();
    }
}

class IntelFactory implements CPUFactory {

    @Override
    public CPU produceCPU() {
        return new IntelCPU();
    }
}
