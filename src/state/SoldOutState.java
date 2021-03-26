package state;

public class SoldOutState implements State{

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        throw new UnsupportedOperationException("cannot insert coins, machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        throw new UnsupportedOperationException("cannot eject coins, machine is sold out");
    }

    @Override
    public void turnCrank() {
        throw new UnsupportedOperationException("cannot turn crank, machine is sold out");
    }

    @Override
    public void dispense() {
        throw new UnsupportedOperationException("cannot dispense, machine is sold out");
    }

    @Override
    public void refill(int numberOfGumballs) {
        gumballMachine.setNumberOfGumballs(numberOfGumballs);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

}
