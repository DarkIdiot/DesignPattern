package designpatterns.adapter;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:37:34
 */
public class Adapter extends Target {
	// ����һ��˽�е�Adeptee����
    private Adaptee adaptee = new Adaptee();

    /**
     *  ͨ����д�������ϵ���Request()�����������ʵ�ʵ���SpecificRequest()
     */
    @Override
    public  void Request()
    {
        adaptee.SpecificRequest();
    }
}
