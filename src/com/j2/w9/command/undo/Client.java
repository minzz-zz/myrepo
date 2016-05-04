package com.j2.w9.command.undo;



public class Client{
  public static void main(String[] args){
    RemoteControlWithUndo rcwu = new RemoteControlWithUndo();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    GarageDoor door = new GarageDoor();
    GarageOpenCommand doorOpen = new GarageOpenCommand(door);
    GarageCloseCommand doorClose = new GarageCloseCommand(door);
    DVDPlayer dvd = new DVDPlayer();
    DVDPlayCommand dvdPlay = new DVDPlayCommand(dvd);
    DVDStopCommand dvdStop = new DVDStopCommand(dvd);
    rcwu.setCommand(0,lightOn,lightOff);
    rcwu.setCommand(1, doorOpen, doorClose);
    rcwu.setCommand(2, dvdPlay, dvdStop);
    rcwu.onButtonWasPushed(0);
    rcwu.offButtonWasPushed(0);
    rcwu.onButtonWasPushed(1);
    rcwu.offButtonWasPushed(1);
    rcwu.onButtonWasPushed(2);
    rcwu.offButtonWasPushed(2);
  }
}