package com.j2.forTest.decorator;


public class Mocha extends CondimentDecorator{
  Beverage beverage;
  public Mocha(Beverage beverage){
    this.beverage=beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", Mocha";
  }
  
  public Double cost(){
    return beverage.cost() + 0.20;
  }
}