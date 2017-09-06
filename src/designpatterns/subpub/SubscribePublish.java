package designpatterns.subpub;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Description: è®¢é˜…å™¨ç±»
 * @author: darkidiot
 * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:07:20
 */
public class SubscribePublish<M> {
	// è®¢é˜…å™¨åç§?
	private String name;
	// è®¢é˜…å™¨é˜Ÿåˆ—å®¹é‡?
	final int QUEUE_CAPACITY = 20;
	// è®¢é˜…å™¨å­˜å‚¨é˜Ÿåˆ?
	private BlockingQueue<Msg> queue = new ArrayBlockingQueue<Msg>(QUEUE_CAPACITY);
	// è®¢é˜…è€?
	private List<ISubcriber> subcribers = new ArrayList<ISubcriber>();

	/**
	 * @Description:æ„é? æ–¹æ³?
	 * @param name
	 */
	public SubscribePublish(String name) {
		this.name = name;
	}

	/**
	 * @Description: æ¥æ”¶å‘å¸ƒè€…çš„æ¶ˆæ¯
	 * @param publisher
	 * @param Msg
	 * @param isInstantMsg
	 * @author: darkidiot
	 * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:17:03
	 */
	public void publish(String publisher, M message, boolean isInstantMsg) {
		if (isInstantMsg) {
			update(publisher, message);
			return;
		}

		Msg<M> m = new Msg<M>(publisher, message);
		if (queue.offer(m)) {
			update();
		}
	}

	/**
	 * @Description: è®¢é˜…
	 * @param subcriber
	 * @return: void
	 * @author: darkidiot
	 * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:18:43
	 */
	public void subcribe(ISubcriber subcriber) {
		subcribers.add(subcriber);
	}

	/**
	 * @Description: é€?è®?
	 * @param subcriber
	 * @return: void
	 * @author: darkidiot
	 * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:18:43
	 */
	public void unSubcribe(ISubcriber subcriber) {
		subcribers.remove(subcriber);
	}

	/**
	 * @Description: å‘é?å­˜å‚¨é˜Ÿåˆ—æ‰€æœ‰æ¶ˆæ?
	 * @return: void
	 * @author: darkidiot
	 * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:20:33
	 */
	public void update() {
		Msg m = null;
		if(queue.size() > 1){
			return;
		}
		while ((m = queue.poll()) != null) {
			this.update(m.getPublisher(), (M) m.getMsg());
		}
	}

	/**
	 * @Description: å‘é?æ¶ˆæ?
	 * @param publisher
	 * @param Msg
	 * @return: void
	 * @author: darkidiot
	 * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:14:29
	 */
	public void update(String publisher, M Msg) {
		for (ISubcriber subcriber : subcribers) {
			subcriber.update(publisher, Msg);
		}
	}
}

/**
 * @Description: æ¶ˆæ¯ç±?
 * @author: darkidiot
 * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:25:21
 */
class Msg<M> {
	private String publisher;
	private M m;

	public Msg(String publisher, M m) {
		this.publisher = publisher;
		this.m = m;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public M getMsg() {
		return m;
	}

	public void setMsg(M m) {
		this.m = m;
	}
}