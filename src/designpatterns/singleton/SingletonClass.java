package designpatterns.singleton;

/**
 * ����ʽ��Ҳ�ǳ��õ���ʽ��
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����7:28:37
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
