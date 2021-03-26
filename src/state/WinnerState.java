package state;

public class WinnerState implements State{

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        throw new UnsupportedOperationException("Please wait, we’re already giving you a gumball");
    }
    @Override
    public void ejectQuarter() {
        throw new UnsupportedOperationException("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        throw new UnsupportedOperationException("Turning twice does not get you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("YOU’RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getNumberOfGumballs() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getNumberOfGumballs() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill(int numberOfGumballs) {
        throw new UnsupportedOperationException("no need of refilling...");
    }
}
