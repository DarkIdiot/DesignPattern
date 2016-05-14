package designpatterns.abstractfactory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午10:32:13
 */
public class AMDFactory implements CPUFactory {

	@Override
	public CPU produceCPU() {
        return new AMDCPU();
    }

}
