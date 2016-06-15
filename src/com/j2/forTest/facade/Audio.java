package com.j2.forTest.facade;

public class Audio{
  int level;
  public void on(){
    System.out.println("Audio is on!");
  }
  public void off(){
    System.out.println("Audio is off!");
  }
  public void changeVolume(int level){
    this.level = level;
    if (level == 0){
      off();
    }
    System.out.println("change Audio volume to : " + level);
  }
}