package com.j2.forFinal.template.hook;


import java.io.*;

public abstract class CaffeineBeverage{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if (customerWant()){
      addCondiments();
    }
  }
  public abstract void brew();
  public abstract void addCondiments();
  public void boilWater(){
    System.out.println("Boil water!");
  }
  public void pourInCup(){
    System.out.println("Pour in cup!");
  }
  public boolean customerWant(){
    String input = getUserInput();
    if (input.toLowerCase().startsWith("y")){
      return true;
    } else{
      return false;
    }
  }
  public String getUserInput(){
    String answer = null;
    System.out.println("Do you want add condiments?");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    }catch (Exception e){
      System.out.println("read error");
    }
    if (answer == null){
      return "no";
    }
    return answer;
  }
}