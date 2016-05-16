package com.j2.w11.template.Barista;


import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Brew Coffee Grinds");
  }
  public void addCondiments(){
    System.out.println("Add Sugar or Milk");
  }
  public boolean customerWantsCondiments(){
    String answer = getUserInput();
    
    if (answer.toLowerCase().startsWith("y")){
      return true;
    }
    else{
      return false;
    }
  }
  
  private String getUserInput() {
    String answer = null;
    
    System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("IO error trying to read your answer");
    }
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}