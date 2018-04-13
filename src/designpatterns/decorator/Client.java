package designpatterns.decorator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:43:10
 */
public class Client {
    public static void main(String[] args) {
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());

        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());
    }
}

abstract class Girl {
    String description = "no particular";

    public String getDescription() {
        return description;
    }
}

class AmericanGirl extends Girl {
    public AmericanGirl() {
        description = "+American";
    }

}

class EuropeanGirl extends Girl {
    public EuropeanGirl() {
        description = "+European";
    }

}

abstract class GirlDecorator extends Girl {
    public abstract String getDescription();
}

class Art extends GirlDecorator {

    private Girl girl;

    public Art(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Art";
    }

    public void draw() {
        System.out.println("draw pictures!");
    }

}

class Science extends GirlDecorator {

    private Girl girl;

    public Science(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Science";
    }

    public void caltulateStuff() {
        System.out.println("scientific calculation!");
    }
}
