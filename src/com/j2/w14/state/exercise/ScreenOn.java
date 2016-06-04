package com.j2.w14.state.exercise;


public class ScreenOn implements State{
  DvdPlayer dvdPlayer;
  public ScreenOn(DvdPlayer dvdPlayer){
    this.dvdPlayer = dvdPlayer;
  }
  public void play(){
    System.out.println("Dvd is alway playing!");
  }
  public void pause(){
    System.out.println("You push pause button: screen get dark");
    dvdPlayer.setState(dvdPlayer.getScreenGetDark());
  }
  public void end(){
    System.out.println("Dvd is finish: screen off");
    dvdPlayer.setState(dvdPlayer.getScreenOff());
  }
  public void stop(){
    System.out.println("You push stop button: screen off");
    dvdPlayer.setState(dvdPlayer.getScreenOff());
  }
}