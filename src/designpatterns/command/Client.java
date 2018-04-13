package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:44:47
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        Switch s = new Switch();

        String str = "shutdown"; // get value based on real situation

        if (str == "shutdown") {
            s.storeAndExecute(shutdown);
        } else {
            s.storeAndExecute(restart);
        }
    }
}

interface Command {
    void execute();
}

class Computer {
    public void shutDown() {
        System.out.println("computer is shut down");
    }

    public void restart() {
        System.out.println("computer is restarted");
    }
}

class RestartCommand implements Command {

    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.restart();
    }
}

class ShutDownCommand implements Command {
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.shutDown();
    }
}

class Switch {
    private List<Command> history = new ArrayList<Command>();

    public Switch() {
    }

    public void storeAndExecute(Command command) {
        this.history.add(command); // optional, can do the execute only!
        command.execute();
    }
}
