package designpatterns.factory;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:03:49
 */
public class Clinet {
    public static void main(String[] args) {
        Human boy = HumanFactory.createHuman("boy");
        boy.Talk();
        boy.Walk();
        Human girl = HumanFactory.createHuman("girl");
        girl.Talk();
        girl.Walk();
    }
}

interface Human {
    void Talk();

    void Walk();
}

class Boy implements Human {

    @Override
    public void Talk() {
        System.out.println("Boy is talking...");
    }

    @Override
    public void Walk() {
        System.out.println("Boy is walking...");
    }

}

class Girl implements Human {

    @Override
    public void Talk() {
        System.out.println("Girl is talking...");
    }

    @Override
    public void Walk() {
        System.out.println("Girl is walking...");
    }
}


class HumanFactory {
    public static Human createHuman(String m) {
        Human p = null;
        if (m == "boy") {
            p = new Boy();
        } else if (m == "girl") {
            p = new Girl();
        }

        return p;
    }
}
