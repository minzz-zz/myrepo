package com.j2.w13.state.before;



public class GumballMachine{
  final static int SOLD_OUT = 0;
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD = 3;
  int state = SOLD_OUT;
  
  int count = 0;
  public GumballMachine(int count){
    this.count = count;
    if (count>0){
      state = NO_QUARTER;
    }
  }
  public void insertQuarter(){
    if (state == HAS_QUARTER){
      state = NO_QUARTER;
      System.out.println("You can't insert another quarter");
    }
    else if (state == NO_QUARTER){
      state = HAS_QUARTER;
      System.out.println("You inserted quarter");
    }
    else if (state == SOLD_OUT){
      System.out.println("you can't insert sold out!");
    }
    else if (state == SOLD){
      System.out.println("wait. we have already given a gumball");
    }
  }
  
  public void ejectQuarter(){
    if (state == HAS_QUARTER){
      state = NO_QUARTER;
      System.out.println("Quarter returned.");
    }
    else if (state == NO_QUARTER){
      System.out.println("You inserted quarter");
    }
    else if (state == SOLD_OUT){
      System.out.println("you can't insert sold out!");
    }
    else if (state == SOLD){
      System.out.println("wait. we have already given a gumball");
    }
  }
  public void turnCrank(){
    if (state == HAS_QUARTER){
      state = SOLD;
      System.out.println("Turn To sold");
    }
    else if (state == NO_QUARTER){
      System.out.println("You inserted quarter");
    }
    else if (state == SOLD_OUT){
      System.out.println("you can't insert sold out!");
    }
    else if (state == SOLD){
      System.out.println("wait. we have already given a gumball");
    }
  }
  public void dispense(){
    if (state == HAS_QUARTER){
      state = NO_QUARTER;
      System.out.println("Quarter returned.");
    }
    else if (state == NO_QUARTER){
      System.out.println("You inserted quarter");
    }
    else if (state == SOLD_OUT){
      System.out.println("you can't insert sold out!");
    }
    else if (state == SOLD){
      System.out.println("wait. we have already given a gumball");
    }
  }
}