package designpatterns.builder;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午5:18:31
 */

// 客户
public class CLient {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();

        // 也可以用泡茶builder沏茶
        StarbucksBuilder teaBuilder = new TeaBuilder();

        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();

        // 取到饮料
        Starbucks drink = waiter.getstarbucksDrink();

    }
}

class CoffeeBuilder extends StarbucksBuilder {
    public void buildSize() {
        starbucks.setSize("medium");
        System.out.println("build medium size");
    }

    public void buildDrink() {
        starbucks.setDrink("coffee");
        System.out.println("build coffee");
    }
}

class Starbucks {
    private String size;
    private String drink;

    public void setSize(String size) {
        this.size = size;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}

abstract class StarbucksBuilder {
    protected Starbucks starbucks;

    public Starbucks getStarbucks() {
        return starbucks;
    }

    public void createStarbucks() {
        starbucks = new Starbucks();
        System.out.println("a drink is created");
    }

    public abstract void buildSize();

    public abstract void buildDrink();
}

class TeaBuilder extends StarbucksBuilder {
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }

    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("build tea");
    }

}

class Waiter {
    private StarbucksBuilder starbucksBuilder;

    public void setStarbucksBuilder(StarbucksBuilder builder) {
        starbucksBuilder = builder;
    }

    public Starbucks getstarbucksDrink() {
        return starbucksBuilder.getStarbucks();
    }

    public void constructStarbucks() {
        starbucksBuilder.createStarbucks();
        starbucksBuilder.buildDrink();
        starbucksBuilder.buildSize();
    }
}