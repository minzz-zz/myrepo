package com.j2.forTest.decorator;


public abstract class Beverage{
  String description=null;
  public String getDescription(){
    return description;
  }
  public abstract Double cost();
}