package com.j2.w11.template.Barista;



public class BeforeTea{
  void prepareRecipe(){
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }
  
  public void boilWater(){
    System.out.println("Boiling water");
  }
  public void steepTeaBag(){
    System.out.println("Steeping tea bag");
  }
  public void pourInCup(){
    System.out.println("Pour in cup");
  }
  public void addLemon(){
    System.out.println("Add lemon");
  }
}