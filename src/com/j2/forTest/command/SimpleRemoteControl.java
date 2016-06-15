package com.j2.forTest.command;


public class SimpleRemoteControl{
  Command slot;
  public void setCommand(Command command){
    slot = command;
  }
  public void buttonPushed(){
    slot.execute();
  }
}