package designpatterns.subpub;
  
/**  
 * @Description: 发布订阅测试�? 
 * @author: darkidiot
 * @date: 2016�?9�?29�? 下午5:28:53 
 */  
public class SubPubTest {  
    public static void main(String[] args) {  
        SubscribePublish<String> subscribePublish = new SubscribePublish<String>("订阅�?");  
        IPublisher<String> publisher1 = new PublisherImpOne<String>("发布�?1");  
        IPublisher<String> publisher2 = new PublisherImpOne<String>("发布�?2");  
        ISubcriber<String> subcriber1 = new SubcriberImpOne<String>("订阅�?1");  
        ISubcriber<String> subcriber2 = new SubcriberImpOne<String>("订阅�?2");  
        
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