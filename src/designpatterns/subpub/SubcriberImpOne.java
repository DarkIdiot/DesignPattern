package designpatterns.subpub;
  
/**  
 * @Description: 订阅者实现类 
 * @author: darkidiot 
 * @date: 2016�?9�?29�? 下午5:10:00 
 */  
public class SubcriberImpOne<M> implements ISubcriber<M>{  
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
        System.out.println(this.name+"收到"+publisher+"发来的消�?:"+message.toString());  
    }  
  
      
  
  
}  