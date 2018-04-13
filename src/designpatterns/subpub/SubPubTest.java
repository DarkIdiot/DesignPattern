package designpatterns.subpub;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Description: 发布订阅测试类 
 * @author: darkidiot
 * @date: 2016年9月29日 下午5:28:53 
 */  
public class SubPubTest {  
    public static void main(String[] args) {  
        SubscribePublish<String> subscribePublish = new SubscribePublish<String>("订阅器");  
        IPublisher<String> publisher1 = new PublisherImpOne<String>("发布者1");  
        IPublisher<String> publisher2 = new PublisherImpOne<String>("发布者2");  
        ISubcriber<String> subcriber1 = new SubcriberImpOne<String>("订阅者1");  
        ISubcriber<String> subcriber2 = new SubcriberImpOne<String>("订阅者2");  
        
        subcriber1.subcribe(subscribePublish);  
        subcriber2.subcribe(subscribePublish);  
          
        publisher1.publish(subscribePublish, "welcome",true);  
        publisher1.publish(subscribePublish, "to",true);  
        publisher1.publish(subscribePublish, "yy",false);  
        publisher2.publish(subscribePublish, "welcome",true);  
        publisher2.publish(subscribePublish, "to",true);  
        publisher2.publish(subscribePublish, "yy",false);  
    }  
  
}

interface IPublisher<M> {

    /**
     * @Description: 向订阅器发布消息
     * @param subscribePublish 订阅器
     * @param message 消息
     * @param isInstantMsg  是否立即发送
     * @author: darkidiot
     * @date: 2016年9月29日 下午5:08:52
     */
    void publish(SubscribePublish subscribePublish, M message, boolean isInstantMsg);
}

class PublisherImpOne<M> implements IPublisher<M>{
    private String name;

    public PublisherImpOne(String name) {
        super();
        this.name = name;
    }

    public void publish(SubscribePublish subscribePublish, M message,boolean isInstantMsg) {
        subscribePublish.publish(this.name, message, isInstantMsg);
    }

}

interface ISubcriber<M> {

    /**
     * @Description: 订阅
     * @param: subscribePublish 订阅器
     * @author: darkidiot
     * @date: 2016年9月29日 下午5:08:04
     */
    void subcribe(SubscribePublish subscribePublish);
    /**
     * @Description: 退订
     * @param: subscribePublish 订阅器
     * @author: darkidiot
     * @date: 2016年9月29日 下午5:09:00
     */
    void unSubcribe(SubscribePublish subscribePublish);
    /**
     * @Description: 接收消息
     * @param: publisher 发布者
     * @param: message 消息
     * @author: darkidiot
     * @date: 2016年9月29日 下午5:09:44
     */
    void update(String publisher, M message);
}

class SubcriberImpOne<M> implements ISubcriber<M>{
    public String name;
    public SubcriberImpOne(String name) {
        super();
        this.name = name;
    }

    public void subcribe(SubscribePublish subscribePublish) {
        subscribePublish.subcribe(this);
    }

    public void unSubcribe(SubscribePublish subscribePublish) {
        subscribePublish.unSubcribe(this);
    }

    public void update(String publisher,M message) {
        System.out.println(this.name+"收到"+publisher+"发来的消息:"+message.toString());
    }
}


class SubscribePublish<M> {
    // 订阅器名称
    private String name;
    // 订阅器队列容量
    final int QUEUE_CAPACITY = 20;
    // 订阅器存储队列
    private BlockingQueue<Msg> queue = new ArrayBlockingQueue<Msg>(QUEUE_CAPACITY);
    // 订阅者
    private List<ISubcriber> subcribers = new ArrayList<ISubcriber>();

    /**
     * @Description:构造方法
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
     * @date: 2016年9月29日 下午5:17:03
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
     * @date: 2016年9月29日 下午5:18:43
     */
    public void subcribe(ISubcriber subcriber) {
        subcribers.add(subcriber);
    }

    /**
     * @Description: 退订
     * @param subcriber
     * @return: void
     * @author: darkidiot
     * @date: 2016年9月29日 下午5:18:43
     */
    public void unSubcribe(ISubcriber subcriber) {
        subcribers.remove(subcriber);
    }

    /**
     * @Description: 发送存储队列所有消息
     * @return: void
     * @author: darkidiot
     * @date: 2016年9月29日 下午5:20:33
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
     * @Description: 发送消息
     * @param publisher
     * @param Msg
     * @return: void
     * @author: darkidiot
     * @date: 2016年9月29日 下午5:14:29
     */
    public void update(String publisher, M Msg) {
        for (ISubcriber subcriber : subcribers) {
            subcriber.update(publisher, Msg);
        }
    }
}

/**
 * @Description: 消息类
 * @author: darkidiot
 * @date: 2016年9月29日 下午5:25:21
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