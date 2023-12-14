package hf.dp.StatePattern;

public class WinnerState implements State {
    GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() { //the same code for ejectQuarter()/turnCrank()
        System.out.println("you inserted Quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you ejected Quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
