package state;

public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        throw new UnsupportedOperationException("You haven’t inserted a quarter");
    }

    @Override
    public void turnCrank() {
        throw new UnsupportedOperationException("You turned, but there’s no quarter");
    }

    @Override
    public void dispense() {
        throw new UnsupportedOperationException("You need to pay first");
    }

    @Override
    public void refill(int numberOfGumballs) {
        throw new UnsupportedOperationException("no need of refilling...");
    }
}
