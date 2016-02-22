package designpatterns.chainofresponsibility;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��7�� ����12:03:48
 */
public class C extends Chain {
    public C(int threshold) { 
        this.Threshold = threshold;
    }
    @Override
    protected void writeMessage(String msg) {
        System.out.println("C: " + msg);
    }
}
