package com.j2.w14.state;


public class HasQuarter implements State{
  GumballMachine gumballMachine;
  public HasQuarter(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("You cannot insert another quarter");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You turned...");
    gumballMachine.setState(gumballMachine.getSoldState());
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
}