package com.j2.w14.state;

public interface State{
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}