package com.j2.forTest.command.undo;


public class CommandTestDrive{
  public static void main(String [] args){
    Light light = new Light();
    LightOnCommand loc = new LightOnCommand(light);
    LightOffCommand loffc = new LightOffCommand(light);
    RemoteControl rc = new RemoteControl();
    rc.setCommand(0, loc, loffc);
    rc.onButtonPushed(0);
    rc.offButtonPushed(0);
    rc.undoButtonPushed();
  }
}