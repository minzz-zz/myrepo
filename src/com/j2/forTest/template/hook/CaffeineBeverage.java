package com.j2.forTest.template.hook;

public abstract class CaffeineBeverage{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWants()){
      addCondiments();
    }
  }
  public abstract void brew();
  public abstract void addCondiments();
  public void boilWater(){
    System.out.println("Boin water...");
  }
  public void pourInCup(){
    System.out.println("Pour in cup...");
  }
  public boolean customerWants(){
    return true;
  }
}