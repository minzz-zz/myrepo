package com.j2.w11.facade.smartHome;


public class SmartHomeFacade{
  StandLight standLight;
  Audio audio;
  Labtop labtop;
  MainLight mainLight;
  
  public SmartHomeFacade(StandLight standLight, Audio audio, Labtop labtop, MainLight mainLight){
    this.standLight = standLight;
    this.audio = audio;
    this.labtop = labtop;
    this.mainLight = mainLight;
  }
  public void startStudy(){
    mainLight.off();
    standLight.on();
    standLight.setLevel(5);
    audio.on();
    audio.setLevel(4);
    labtop.on();
    System.out.println("You can start studying");
    System.out.println();
  }
  public void endStudy(){
    mainLight.on();
    standLight.off();
    audio.off();
    labtop.off();
  }
}