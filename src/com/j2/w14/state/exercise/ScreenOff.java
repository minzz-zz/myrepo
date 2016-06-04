package com.j2.w14.state.exercise;


public class ScreenOff implements State{
  DvdPlayer dvdPlayer;
  public ScreenOff(DvdPlayer dvdPlayer){
    this.dvdPlayer = dvdPlayer;
  }
  public void play(){
    System.out.println("You push play button: screen on!");
    dvdPlayer.setState(dvdPlayer.getScreenOn());
  }
  public void pause(){
    System.out.println("No dvd is playing now. You can't pause.");
  }
  public void end(){
    System.out.println("No dvd is playing now.");
  }
  public void stop(){
    System.out.println("No dvd is plaing now. You can't stop.");
  }
}