package designpatterns.adapter;

/**
 * 定义客户端期待的接口
 * 
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:35:11
 */
public abstract class Target {
    /// 使用abstract修饰以便子类可以重写
    public abstract void Request();
}
