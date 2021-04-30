package state;

import java.util.AbstractMap;

public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;

    State currentState;

    int numberOfGumballs;

    public GumballMachine(int numberOfGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);


        this.numberOfGumballs = numberOfGumballs;
        if( numberOfGumballs > 0 ) {
            currentState = noQuarterState;
        }

    }

    public void insertQuarter(){
        currentState.insertQuarter();
    }

    public void ejectQuarter(){
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (numberOfGumballs != 0) {
            numberOfGumballs = numberOfGumballs - 1;
        }
    }

    public void refill(int numberOfGumballs) {
        currentState.refill(numberOfGumballs);
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getNumberOfGumballs() {
        return numberOfGumballs;
    }

    public void setNumberOfGumballs(int numberOfGumballs) {
        this.numberOfGumballs = numberOfGumballs;
    }
}
