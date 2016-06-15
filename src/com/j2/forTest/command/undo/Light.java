package com.j2.forTest.command.undo;


public class Light{
  int level;
  public void on(){
    System.out.println("Light on!");
    level = 100;
  }
  public void off(){
    System.out.println("Light off!");
    level = 0;
  }
  public void dim(int level){
    this.level = level;
    System.out.println("Light dimmed : " + level);
    if (level == 0){
      off();
    }
  }
  public int getLevel(){
    return level;
  }
}