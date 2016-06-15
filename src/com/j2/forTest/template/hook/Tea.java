package com.j2.forTest.template.hook;


import java.util.Scanner;

public class Tea extends CaffeineBeverage{
  public void brew(){
    System.out.println("Brew the tea bag...");
  }
  public void addCondiments(){
    System.out.println("Add lemon");
  }
  public boolean customerWant(){
    String answer = getUserInput();
    if (answer.toLowerCase().startsWith("y")){
      return true;
    } else {
      return false;
    }
  }
  private String getUserInput(){
    String answer = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you want add lemon? (Y/N)");
    answer = sc.nextLine();
    return answer;
  }
}