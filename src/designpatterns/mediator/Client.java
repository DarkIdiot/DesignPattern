package designpatterns.mediator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月7日 上午12:13:11
 */
public class Client {
    public static void main(String[] args) {
        IMediator mediator = new ConcreteMediator();

        ColleagueA talkColleague = new ColleagueA(mediator);
        ColleagueB fightColleague = new ColleagueB(mediator);

        talkColleague.doSomething();
        fightColleague.doSomething();
    }
}

abstract class Colleague {
    IMediator mediator;

    public abstract void doSomething();
}

class ColleagueA extends Colleague {

    public ColleagueA(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doSomething() {
        this.mediator.talk();
        this.mediator.registerA(this);
    }
}

class ColleagueB extends Colleague {
    public ColleagueB(IMediator mediator) {
        this.mediator = mediator;
        this.mediator.registerB(this);
    }

    @Override
    public void doSomething() {
        this.mediator.fight();
    }
}

interface IMediator {
    void fight();

    void talk();

    void registerA(ColleagueA a);

    void registerB(ColleagueB a);
}

class ConcreteMediator implements IMediator {

    ColleagueA talk;
    ColleagueB fight;

    public void registerA(ColleagueA a) {
        talk = a;
    }

    public void registerB(ColleagueB b) {
        fight = b;
    }

    public void fight() {
        System.out.println("Mediator is fighting");
        // let the fight colleague do some stuff
    }

    public void talk() {
        System.out.println("Mediator is talking");
        // let the talk colleague do some stuff
    }
}