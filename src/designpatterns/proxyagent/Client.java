package designpatterns.proxyagent;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:33:18
 */
public class Client {
    public static void main(String[] args) {
        BusinessAgent businessAgent = new BusinessAgent();
        businessAgent.seduceMan();
        businessAgent.happyWithMan();
    }
}

interface CheatingWife {
    // think about what this kind of women can do
    void seduceMan(); // such as eye contact with men

    void happyWithMan(); // happy what? You know that.
}


class BusinessAgent implements CheatingWife {
    private CheatingWife cheatingWife;

    public BusinessAgent() {

        this.cheatingWife = new HouseWifeOne();
    }

    public BusinessAgent(CheatingWife cheatingWife) {
        this.cheatingWife = cheatingWife;
    }

    @Override
    public void seduceMan() {
        this.cheatingWife.seduceMan();
    }

    @Override
    public void happyWithMan() {
        this.cheatingWife.happyWithMan();
    }
}

class HouseWifeOne implements CheatingWife {

    @Override
    public void seduceMan() {
        System.out.println("HouseWifeOne secude men, such as making some sexy poses ...");
    }

    @Override
    public void happyWithMan() {
        System.out.println("HouseWifeOne is happy with man ...");
    }
}
