package com.j2.w14.proxy;


public class Sold implements State{
  transient GumballMachine gumballMachine;
  public Sold(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("Please wait, we're already giving you a gumball");
  }
  public void insertWrongQuarter(){
    System.out.println("Please wait, we're already giving you a gumball");
  }
  public void ejectQuarter(){
    System.out.println("Sorry, you already turned the crank");
  }
  public void turnCrank(){
    System.out.println("Sorry, you already turned the crank, please wait!");
  }
  public void dispense(){
    if (gumballMachine.getCount()>0){
      System.out.println("Here's your gumball!");
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    else{
      System.out.println("Sorry, the machine is sold out!");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }
}