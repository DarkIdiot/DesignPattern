package designpatterns.singleton;

/**
 * 懒汉式，也是常用的形式。
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午7:28:37
 */

public class SingletonClass{
    private static SingletonClass instance=null;
    public static SingletonClass getInstance(){
        if(instance==null){
            synchronized(SingletonClass.class){
                if(instance==null){
                    instance=new SingletonClass();
                }
            }
        }
        return instance;
    }

	private SingletonClass(){}
}
