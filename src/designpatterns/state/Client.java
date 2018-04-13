package designpatterns.state;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:50:17
 */
public class Client {
    public static void main(String[] args) {
        StateContext sc = new StateContext();
        sc.saySomething();
        sc.saySomething();
        sc.saySomething();
        sc.saySomething();
    }
}

interface State {
    void saySomething(StateContext sc);
}

class Poor implements State {

    @Override
    public void saySomething(StateContext sc) {
        System.out.println("I'm poor currently, and spend much time working.");
        sc.changeState(new Rich());
    }
}

class Rich implements State {

    @Override
    public void saySomething(StateContext sc) {
        System.out.println("I'm rick currently, and play a lot.");
        sc.changeState(new Poor());
    }
}

class StateContext {
    private State currentState;

    public StateContext() {
        currentState = new Poor();
    }

    public void changeState(State newState) {
        this.currentState = newState;
    }

    public void saySomething() {
        this.currentState.saySomething(this);
    }
}
