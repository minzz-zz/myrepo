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
    rcwu.setCommand(0,lightOn,lightOff);
    rcwu.setCommand(1, doorOpen, doorClose);
    rcwu.onButtonWasPushed(0);
    rcwu.offButtonWasPushed(0);
    rcwu.onButtonWasPushed(1);
    rcwu.offButtonWasPushed(1);
  }
}