package com.j2.w11.template.Barista;


import java.io.*;

public class TeaWithHook extends CaffeineBeverage{
  public void brew(){
    System.out.println("Steeping tea bag");
  }
  public void addCondiments(){
    System.out.println("Add Lemon");
  }
   public boolean customerWantsCondiments() {

  String answer = getUserInput();

  if (answer.toLowerCase().startsWith("y")) {
   return true;
  } else {
   return false;
  }
 }
 
 private String getUserInput() {
   String answer = null;
   
   System.out.print("Would you like lemon with your tea (y/n)? ");
   
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