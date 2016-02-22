package designpatterns.iterator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����11:15:52
 */
public class Client {
	public static void main(String[] args) {
		RecordCollection recordCollection = new RecordCollection();
		IIterator iter = recordCollection.createIterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
