package com.j2.w14.state;


public class GumballMachine{
  State soldOut;
  State noQuarter;
  State hasQuarter;
  State sold;
  
  State state = soldOut;
  int count = 0;
  
  public GumballMachine(int count){
    soldOut = new SoldOut(this);
    noQuarter = new NoQuarter(this);
    hasQuarter = new HasQuarter(this);
    sold = new Sold(this);
    
    this.count = count;
    if (count>0){
      state = noQuarter;
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
public void setState(State state) {
    this.state = state;
  }
  public State getNoQuarterState(){
    return noQuarter;
  }
  public State getSoldState(){
    return sold;
  }
  public State getHasQuarterState(){
    return hasQuarter;
  }
  public State getSoldOutState(){
    return soldOut;
  }
  public int getCount(){
    return count;
  }
}