package com.j2.forFinal.facade;

public class HomeTheater{
  Screen screen;
  Audio audio;
  public HomeTheater(Screen screen, Audio audio){
    this.screen = screen;
    this.audio = audio;
  }
  public void startMovie(){
    System.out.println("Prepare to start movie");
    screen.on();
    audio.on();
    screen.fullScreen();
    audio.changeVolume(10);
  }
}