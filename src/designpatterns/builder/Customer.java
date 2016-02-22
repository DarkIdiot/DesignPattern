package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015��12��6�� ����5:18:31
 */

// �ͻ�
public class Customer {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		StarbucksBuilder coffeeBuilder = new CoffeeBuilder();

		// Ҳ�������ݲ�builder���
		StarbucksBuilder teaBuilder = new TeaBuilder();

		waiter.setStarbucksBuilder(coffeeBuilder);
		waiter.constructStarbucks();

		// ȡ������
		Starbucks drink = waiter.getstarbucksDrink();

	}
}