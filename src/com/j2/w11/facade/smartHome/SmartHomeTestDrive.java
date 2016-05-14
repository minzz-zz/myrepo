package com.j2.w11.facade.smartHome;


public class SmartHomeTestDrive{
  public static void main(String [] args){
    Audio audio = new Audio();
    Labtop labtop = new Labtop();
    MainLight mainLight = new MainLight();
    StandLight standLight = new StandLight();
    SmartHomeFacade smFacade = new SmartHomeFacade(standLight, audio, labtop, mainLight);
    
    smFacade.startStudy();
    smFacade.endStudy();
  }
}