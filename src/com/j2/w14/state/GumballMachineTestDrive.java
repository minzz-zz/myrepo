package com.j2.w14.state;


public class GumballMachineTestDrive{
  public static void main(String [] args){
    GumballMachine gm = new GumballMachine(5);
    gm.insertWrongQuarter();
    gm.turnCrank();
    gm.ejectQuarter();
    gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
  }
}