package com.j2.w9.command.undo;



public class DVDPlayer{
  int time;
  public DVDPlayer(){}
  public void play(){
    System.out.println("DVD play");
  }
  public void stop(){
    System.out.println("DVD stop");
  }
  public void move(int time){
    this.time = time;
    System.out.println("move to " + time);
  }
}