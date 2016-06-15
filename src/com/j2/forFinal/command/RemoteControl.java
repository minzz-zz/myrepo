package com.j2.forFinal.command;

public class RemoteControl{
  Command slot;
  public void setCommand(Command command){
    slot = command;
  }
  
  public void buttonPressed(){
    slot.execute();
  }
}