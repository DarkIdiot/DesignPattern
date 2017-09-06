package designpatterns.subpub;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Description: 订阅器类
 * @author: darkidiot
 * @date: 2016�?9�?29�? 下午5:07:20
 */
public class SubscribePublish<M> {
	// 订阅器名�?
	private String name;
	// 订阅器队列容�?
	final int QUEUE_CAPACITY = 20;
	// 订阅器存储队�?
	private BlockingQueue<Msg> queue = new ArrayBlockingQueue<Msg>(QUEUE_CAPACITY);
	// 订阅�?
	private List<ISubcriber> subcribers = new ArrayList<ISubcriber>();

	/**
	 * @Description:构�?�方�?
	 * @param name
	 */
	public SubscribePublish(String name) {
		this.name = name;
	}

	/**
	 * @Description: 接收发布者的消息
	 * @param publisher
	 * @param Msg
	 * @param isInstantMsg
	 * @author: darkidiot
	 * @date: 2016�?9�?29�? 下午5:17:03
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
	 * @Description: 订阅
	 * @param subcriber
	 * @return: void
	 * @author: darkidiot
	 * @date: 2016�?9�?29�? 下午5:18:43
	 */
	public void subcribe(ISubcriber subcriber) {
		subcribers.add(subcriber);
	}

	/**
	 * @Description: �?�?
	 * @param subcriber
	 * @return: void
	 * @author: darkidiot
	 * @date: 2016�?9�?29�? 下午5:18:43
	 */
	public void unSubcribe(ISubcriber subcriber) {
		subcribers.remove(subcriber);
	}

	/**
	 * @Description: 发�?�存储队列所有消�?
	 * @return: void
	 * @author: darkidiot
	 * @date: 2016�?9�?29�? 下午5:20:33
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
	 * @Description: 发�?�消�?
	 * @param publisher
	 * @param Msg
	 * @return: void
	 * @author: darkidiot
	 * @date: 2016�?9�?29�? 下午5:14:29
	 */
	public void update(String publisher, M Msg) {
		for (ISubcriber subcriber : subcribers) {
			subcriber.update(publisher, Msg);
		}
	}
}

/**
 * @Description: 消息�?
 * @author: darkidiot
 * @date: 2016�?9�?29�? 下午5:25:21
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