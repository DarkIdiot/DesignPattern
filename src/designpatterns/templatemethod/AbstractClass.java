package designpatterns.templatemethod;

/**
 * ������
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:31:40
 */
public abstract class AbstractClass
{
    // һЩ������Ϊ���ŵ�����ȥʵ��
    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    // ģ�巽�����������߼��ĹǼܣ����߼��������һЩ��Ӧ�ĳ�������������Ƴٵ�����ȥʵ�֡�
    public void TemplateMethod()
    {
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("Done the method.");
    }
}
