package com.j2.w11.facade.smartHome;


public class Audio{
  public void on(){
    System.out.println("Audio on!");
  }
  public void off(){
    System.out.println("Audio off!");
  }
  public void setLevel(int level){
    System.out.println("Audio level : " + level);
  }
}