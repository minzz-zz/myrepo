package com.j2.w14.state.exercise;


public class DvdPlayer{
  State state;
  State screenOn;
  State screenOff;
  State screenGetDark;
  
  public DvdPlayer(){
    screenOn = new ScreenOn(this);
    screenOff = new ScreenOff(this);
    screenGetDark = new ScreenGetDark(this);
    state = screenOff;
  }
  
  public void play(){
    state.play();
  }
  public void pause(){
    state.pause();
  }
  public void end(){
    state.end();
  }
  public void stop(){
    state.stop();
  }
  public void setState(State state) {
    this.state = state;
  }
  public State getScreenOn(){
    return screenOn;
  }
  public State getScreenOff(){
    return screenOff;
  }
  public State getScreenGetDark(){
    return screenGetDark;
  }
}