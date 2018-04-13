package designpatterns.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:50:17
 */
public class Waitress {
    // coffee array
    public static List<ICoffee> coffees = new ArrayList<>();
    // table array
    public static List<CoffeeContext> tables = new ArrayList<>();
    public static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;

    /**
     * 处理订单
     *
     * @param flavorIn
     * @param table
     */
    public static void takeOrder(String flavorIn, int table) {
        coffees.add(coffeeFactory.getCoffeeFlavor(flavorIn));
        tables.add(new CoffeeContext(table));
        ordersCount++;
    }

    public static void takeOrder(int table, String... flavorsIn) {
        tables.add(new CoffeeContext(table));
        coffees.add(coffeeFactory.getCoffeeFlavors(flavorsIn));
        ordersCount++;
    }

    public static void main(String[] args) {
        coffeeFactory = new CoffeeFactory();

        takeOrder("Cappuccino", 2);
        takeOrder("Cappuccino", 2);
        takeOrder("Regular Coffee", 1);
        takeOrder("Regular Coffee", 2);
        takeOrder("Regular Coffee", 3);
        takeOrder("Regular Coffee", 4);
        takeOrder("Cappuccino", 4);
        takeOrder("Cappuccino", 5);
        takeOrder("Regular Coffee", 3);
        takeOrder("Cappuccino", 3);
        takeOrder(6, "Cappuccino", "Latte", "Cafe Noir");

        for (int i = 0; i < ordersCount; ++i) {
            coffees.get(i).serveCoffee(tables.get(i));
        }

        System.out.println("\nTotal Coffee objects made: "
                + coffeeFactory.getTotalCoffeeFlavorsMade());
    }
}

interface ICoffee {
    void serveCoffee(CoffeeContext context);
}

class CompositeCoffee implements ICoffee {
    private Map<String, ICoffee> coffees = new HashMap<>();

    public void add(String flavor, ICoffee coffee) {
        coffees.put(flavor, coffee);
    }

    /**
     * 外蕴状态作为参数传入到方法中
     */
    @Override
    public void serveCoffee(CoffeeContext context) {
        for (Map.Entry<String, ICoffee> coffee : coffees.entrySet()) {
            System.out.println("Serving " + coffee.getKey() + " to table "
                    + context.getTable());
        }

    }
}

class Coffee implements ICoffee {
    private final String flavor;

    public Coffee(String newFlavor) {
        this.flavor = newFlavor;
        System.out.println("Coffee is created! - " + flavor);
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void serveCoffee(CoffeeContext context) {
        System.out.println("Serving " + flavor + " to table "
                + context.getTable());
    }
}

class CoffeeContext {
    private final int tableNumber;

    public CoffeeContext(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTable() {
        return this.tableNumber;
    }
}

class CoffeeFactory {
    private HashMap<String, Coffee> flavors = new HashMap<>();

    /**
     * 单纯享元工厂方法
     *
     * @param flavorName
     * @return
     */
    public ICoffee getCoffeeFlavor(String flavorName) {
        Coffee flavor = flavors.get(flavorName);
        if (flavor == null) {
            flavor = new Coffee(flavorName);
            flavors.put(flavorName, flavor);
        }
        return flavor;
    }

    /**
     * 复合享元工厂方法
     *
     * @return
     */
    public ICoffee getCoffeeFlavors(String... flavorNames) {
        CompositeCoffee compositeCoffee = new CompositeCoffee();
        for (String flavorName : flavorNames) {
            compositeCoffee.add(flavorName, this.getCoffeeFlavor(flavorName));
        }
        return compositeCoffee;
    }

    public int getTotalCoffeeFlavorsMade() {
        return flavors.size();
    }
}