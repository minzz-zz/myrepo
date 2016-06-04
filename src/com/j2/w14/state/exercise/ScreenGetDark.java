package com.j2.w14.state.exercise;


public class ScreenGetDark implements State{
  DvdPlayer dvdPlayer;
  public ScreenGetDark(DvdPlayer dvdPlayer){
    this.dvdPlayer = dvdPlayer;
  }
  public void play(){
    System.out.println("You push play button: DVD will play continually.");
    dvdPlayer.setState(dvdPlayer.getScreenOn());
  }
  public void pause(){
    System.out.println("You push pause button already. You can't push pause button again.");
  }
  public void end(){
    System.out.println("DVD is paused. It can't end now.");
  }
  public void stop(){
    System.out.println("You push stop button: Screen off.");
    dvdPlayer.setState(dvdPlayer.getScreenOff());
  }
}