package designpatterns.subpub;
/**  
 * @Description: 订阅者接�? 
 * @author: darkidiot 
 * @date: 2016�?9�?29�? 下午5:07:20 
 */  
public interface ISubcriber<M> {    
      
    /**      
     * @Description: 订阅  
     * @param: subscribePublish 订阅�? 
     * @author: darkidiot      
     * @date: 2016�?9�?29�? 下午5:08:04 
     */  
    public void subcribe(SubscribePublish subscribePublish);  
    /**      
     * @Description: �?�? 
     * @param: subscribePublish 订阅�? 
     * @author: darkidiot  
     * @date: 2016�?9�?29�? 下午5:09:00 
     */  
    public void unSubcribe(SubscribePublish subscribePublish);  
    /**      
     * @Description: 接收消息    
     * @param: publisher 发布�? 
     * @param: message 消息 
     * @author: darkidiot  
     * @date: 2016�?9�?29�? 下午5:09:44 
     */  
    public void update(String publisher,M message);  
      
}  