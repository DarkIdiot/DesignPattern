package designpatterns.proxyagent;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:31:51
 */
public class HouseWifeOne implements CheatingWife {

	@Override
	public void seduceMan() {
		System.out.println("HouseWifeOne secude men, such as making some sexy poses ...");
	}

	@Override
	public void happyWithMan() {
		System.out.println("HouseWifeOne is happy with man ...");
	}

}
