package designpatterns.subpub;
  
/**  
 * @Description: 发布者实现类 
 * @author: darkidiot 
 * @date: 2016�?9�?29�? 下午5:10:00 
 */  
public class PublisherImpOne<M> implements IPublisher<M>{  
    private String name;  
      
    public PublisherImpOne(String name) {  
        super();  
        this.name = name;  
    }  
  
    public void publish(SubscribePublish subscribePublish, M message,boolean isInstantMsg) {  
        subscribePublish.publish(this.name, message, isInstantMsg);  
    }  
  
}  