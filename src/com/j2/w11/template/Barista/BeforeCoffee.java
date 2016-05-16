package com.j2.w11.template.Barista;


public class BeforeCoffee {
  void prepareRecipe(){
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  
  public void boilWater(){
    System.out.println("Boiling water");
  }
  public void brewCoffeeGrinds(){
    System.out.println("Brew Coffee Grinds");
  }
  public void pourInCup(){
    System.out.println("Pour in cup");
  }
  public void addSugarAndMilk(){
    System.out.println("Add Sugar and Milk");
  }
}