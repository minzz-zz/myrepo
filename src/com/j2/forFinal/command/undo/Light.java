package com.j2.forFinal.command.undo;

public class Light{
  int level;
  public void on(){
    System.out.println("LIght on!");
    this.level = 100;
  }
  public void off(){
    System.out.println("Light off!");
    this.level = 0;
  }
  public void dim(int level){
    this.level = level;
    if (level == 0){
      off();
    }
    System.out.println("Light was dimmed : " + level);
  }
  public int getLevel(){
    return level;
  }
}