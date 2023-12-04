//package hf.dp.StatePattern;
//
//public class SoldOutState implements State{
//    GumballMachine gumballMachine;
//    public SoldOutState(GumballMachine gumballMachine) {
//        this.gumballMachine = gumballMachine;
//    }
//    public void insertQuarter() {
//        System.out.println("Sold Out soon Quarter Reject");
//        gumballMachine.setState(gumballMachine.getHasQuarterState());
//    }
//    public void ejectQuarter() {
//        System.out.println("Try When Fill GumBall");
//    }
//    public void turnCrank() {
//        System.out.println("You turned, but there's N oGumBall");
//    }
//    public void dispense() {
//        System.out.println("No Gumball dispensed");
//    }
//}
