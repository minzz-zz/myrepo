package com.j2.forFinal.command;


public class CommandTestDrive{
  public static void main(String [] args){
    Light light = new Light();
    LightOnCommand onCommand = new LightOnCommand(light);
    RemoteControl remote = new RemoteControl();
    remote.setCommand(onCommand);
    remote.buttonPressed();
  }
}