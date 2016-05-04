package com.j2.w9.command.undo;


public class Light{
  public int level;
  public Light(){}
  public void on(){
    System.out.println("Light on!");
  }
  public void off(){
    System.out.println("Light off!");
  }
  public void dim(int level){
    this.level=level;
    if (level==0){
      off();
    }
    else{
      System.out.println("Light is dimmed to " + level);
    }
  }
  public int getLevel(){
    return level;
  }
}