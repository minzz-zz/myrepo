package com.j2.w14.proxy;


public class BreakDown implements State{
  transient GumballMachine gumballMachine;
  public BreakDown(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter(){
    System.out.println("You can't insert other quarter, machine is break down!");
  }
  public void insertWrongQuarter(){
    System.out.println("You can't insert other quarter, machine is break down!");
  }
  public void ejectQuarter(){
    System.out.println("The wrong quarter is eject!");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You insert wrong quarter! You can't turn crank!");
  }
  public void dispense(){
    System.out.println("You insert wrogn quarter! You can't get gumball");
  }
}