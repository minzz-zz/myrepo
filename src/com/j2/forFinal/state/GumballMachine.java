package com.j2.forFinal.state;


public class GumballMachine{
  State hasQuarter;
  State noQuarter;
  State sold;
  State soldOut;
  State state = soldOut;
  int numOfGum;
  public GumballMachine(int numOfGum){
    this.numOfGum = numOfGum;
    hasQuarter = new HasQuarter(this);
    noQuarter = new NoQuarter(this);
    sold = new Sold(this);
    soldOut = new SoldOut(this);
    
    if (numOfGum > 0){
      this.state = noQuarter;
    }
  }
  public void insertQuarter(){
    state.insertQuarter();
  }
  public void ejectQuarter(){
    state.ejectQuarter();
  }
  public void turnCrank(){
    state.turnCrank();
  }
  public void dispense(){
    state.dispense();
  }
  public void setState(State state){
    this.state = state;
  }
  public State getState(){
    return state;
  }
  public State getHasQuarterState(){
    return hasQuarter;
  }
  public State getNoQuarterState(){
    return noQuarter;
  }
  public State getSoldState(){
    return sold;
  }
  public State getSoldOutState(){
    return soldOut;
  }
}