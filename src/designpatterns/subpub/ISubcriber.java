package designpatterns.subpub;
/**  
 * @Description: è®¢é˜…è€…æ¥å? 
 * @author: darkidiot 
 * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:07:20 
 */  
public interface ISubcriber<M> {    
      
    /**      
     * @Description: è®¢é˜…  
     * @param: subscribePublish è®¢é˜…å™? 
     * @author: darkidiot      
     * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:08:04 
     */  
    public void subcribe(SubscribePublish subscribePublish);  
    /**      
     * @Description: é€?è®? 
     * @param: subscribePublish è®¢é˜…å™? 
     * @author: darkidiot  
     * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:09:00 
     */  
    public void unSubcribe(SubscribePublish subscribePublish);  
    /**      
     * @Description: æ¥æ”¶æ¶ˆæ¯    
     * @param: publisher å‘å¸ƒè€? 
     * @param: message æ¶ˆæ¯ 
     * @author: darkidiot  
     * @date: 2016å¹?9æœ?29æ—? ä¸‹åˆ5:09:44 
     */  
    public void update(String publisher,M message);  
      
}  