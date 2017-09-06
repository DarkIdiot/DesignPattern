package designpatterns.subpub;
/**  
 * @Description: 发布者接�? 
 * @author: darkidiot
 * @date: 2016�?9�?29�? 下午5:07:20 
 */  
public interface IPublisher<M> {    
      
    /**  
     * @Description: 向订阅器发布消息    
     * @param subscribePublish 订阅�? 
     * @param message 消息 
     * @param isInstantMsg  是否立即发�??   
     * @author: darkidiot  
     * @date: 2016�?9�?29�? 下午5:08:52 
     */  
    public void publish(SubscribePublish subscribePublish,M message,boolean isInstantMsg);  
}  