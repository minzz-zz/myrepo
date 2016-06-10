package com.j2.w14.proxy;


public class NoQuarter implements State{
  transient GumballMachine gumballMachine;
  public NoQuarter(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter(){
    System.out.println("You inserted a quarter!");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }
  public void insertWrongQuarter(){
    System.out.println("You inserted a wrong quarter!");
    gumballMachine.setState(gumballMachine.getBreakDownState());
  }
  public void ejectQuarter(){
    System.out.println("You haven't inserted a quarter");
  }
  public void turnCrank(){
    System.out.println("You turned, but there's no quarter");
  }
  public void dispense(){
    System.out.println("You need to pay first");
  }
}