package designpatterns.proxyagent;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:32:39
 */
public class BusinessAgent implements CheatingWife {
	private CheatingWife cheatingWife;
 
	public BusinessAgent() {
 
		this.cheatingWife = new HouseWifeOne();
	}
 
	public BusinessAgent(CheatingWife cheatingWife) {
		this.cheatingWife = cheatingWife;
	}
	@Override
	public void seduceMan() {
		this.cheatingWife.seduceMan();
	}
	@Override
	public void happyWithMan() {
		this.cheatingWife.happyWithMan();
	}
 
}
