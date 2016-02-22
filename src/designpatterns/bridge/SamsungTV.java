package designpatterns.bridge;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:44:51
 */
public class SamsungTV implements ITV{
	  @Override
	    public void on() {
	        System.out.println("Samsung is turned on.");
	    }
	 
	    @Override
	    public void off() {
	        System.out.println("Samsung is turned off.");
	    }
	 
	    @Override
	    public void switchChannel(int channel) {
	        System.out.println("Samsung: channel - " + channel);
	    }
}
