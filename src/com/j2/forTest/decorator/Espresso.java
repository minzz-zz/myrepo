package com.j2.forTest.decorator;


public class Espresso extends Beverage{
  public Espresso(){
    description="Espresso";
  }
  public Double cost(){
    return 0.99;
  }
}