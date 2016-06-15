package com.j2.forFinal.command.undo;


public class UndoTestDrive{
  public static void main(String [] args){
    Light light = new Light();
    LightOnCommand onCommand = new LightOnCommand(light);
    LightOffCommand offCommand = new LightOffCommand(light);
    RemoteControl remote = new RemoteControl();
    remote.setCommand(0, onCommand, offCommand);
    remote.onButtonPushed(0);
    remote.offButtonPushed(0);
    remote.undoButtonPushed();
  }
}