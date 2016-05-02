package com.j2.w9.command;


public class SimpleRemoteControl{
  private Command slot;
  public void setCommand(Command value){
    slot=value;
  }
  public void buttonPressed(){
    slot.execute();
  }
}