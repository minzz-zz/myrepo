package com.j2.forTest.template.hook;

import java.io.*;
import java.util.Scanner;

public class Coffee extends CaffeineBeverage{
  public void brew(){
    System.out.println("Brew the coffee grinds...");
  }
  public void addCondiments(){
    System.out.println("Add sugar and milk");
  }
  public boolean customerWant(){
    String answer = getUserInput();
    if (answer.toLowerCase().startsWith("y")){
      return true;
    } else {
      return false;
    }
  }
  private String getUserIn put(){
    String answer = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you want add sugar and milk? (Y/N)");
    answer = sc.nextLine();
    return answer;
  }
}