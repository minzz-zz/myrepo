package com.j2.w11.template.Barista;


public abstract class CaffeineBeverage {
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  public abstract void brew();
  public abstract void addCondiments();
  public void boilWater(){
    System.out.println("Boiling water....");
  }
  public void pourInCup(){
    System.out.println("Pour in cup....");
  }
}