package com.j2.w14.proxy;


public class HasQuarter implements State{
  transient GumballMachine gumballMachine;
  public HasQuarter(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  public void insertWrongQuarter(){
    System.out.println("You cannot insert another quarter");
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