package com.j2.w11.facade.smartHome;


public class StandLight{
  public void on(){
    System.out.println("Stand Light on!");
  }
  public void off(){
    System.out.println("Stand Light off!");
  }
  public void setLevel(int level){
    System.out.println("Stand Light level : " + level);
  }
}