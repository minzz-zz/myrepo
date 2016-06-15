package com.j2.forTest.template;


public abstract class CaffeineBeverage{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  
  public abstract void brew();
  public abstract void addCondiments();
  public void boilWater(){
    System.out.println("Boil water...");
  }
  public void pourInCup(){
    System.out.println("Pour in cup...");
  }
}