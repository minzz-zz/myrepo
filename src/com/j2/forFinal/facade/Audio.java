package com.j2.forFinal.facade;

public class Audio{
  int level;
  public void on(){
    System.out.println("Audio on!");
  }
  public void off(){
    System.out.println("Audio off!");
  }
  public void changeVolume(int level){
    this.level = level;
    if (level == 0){
      off();
    }
    System.out.println("Volume : " + level);
  }
}