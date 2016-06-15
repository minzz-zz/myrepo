package com.j2.forTest.command;


public class CommandTestDrive{
  public static void main(String [] args){
    Light light = new Light();
    LightOnCommand lightC = new LightOnCommand(light);
    SimpleRemoteControl src = new SimpleRemoteControl();
    src.setCommand(lightC);
    src.buttonPushed();
  }
}