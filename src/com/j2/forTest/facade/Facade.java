package com.j2.forTest.facade;


public class Facade{
  TV tv = new TV();
  Audio audio = new Audio();
  Light light = new Light();
  
  public Facade(TV tv, Audio audio, Light light){
    this.tv = tv;
    this. audio = audio;
    this.light = light;
  }
  
  public void startMovie(){
    tv.on();
    tv.fullScreen();
    light.off();
    audio.on();
    audio.changeVolume(10);
  }
  
  public void endMovie(){
    tv.off();
    light.on();
    audio.off();
  }
}