package com.j2.w14.proxy;


import java.io.Serializable;

public interface State extends Serializable {
  public void insertWrongQuarter();
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}