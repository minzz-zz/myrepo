package com.j2.forFinal.state;


public class HasQuarter implements State {
  GumballMachine gumballMachine;
  public HasQuarter(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter(){
    System.out.println("You already insert Quarter");
  }
  public void ejectQuarter(){
    System.out.println("You choose eject quarter!");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You turn crank, please wait.");
    gumballMachine.setState(gumballMachine.getSoldState());
  }
  public void dispense(){
    System.out.println("Turn crank first!");
  }
}