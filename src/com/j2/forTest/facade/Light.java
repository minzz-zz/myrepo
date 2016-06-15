package com.j2.forTest.facade;

public class Light{
  int level;
  public void on(){
    System.out.println("Light is on!");
  }
  public void off(){
    System.out.println("Light is off!");
  }
  public void dim(int level){
    this.level = level;
    System.out.println("Light dimmed to : " + level);
  }
}