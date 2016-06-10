package com.j2.w14.proxy;


public class SoldOut implements State{
  transient GumballMachine gumballMachine;
  public SoldOut(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("You can't insert quarter, the machine is sold out");
  }
  public void insertWrongQuarter(){
    System.out.println("You can't insert quarter, the machine is sold out");
  }
  public void ejectQuarter(){
    System.out.println("You can't eject, you haven't inserted a quarter yet");
  }
  public void turnCrank(){
    System.out.println("You turned, but there are no gumballs");
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
}