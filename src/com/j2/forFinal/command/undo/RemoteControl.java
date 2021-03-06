package com.j2.forFinal.command.undo;


public class RemoteControl{
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  Command noCommand = new NoCommand();
  public RemoteControl(){
    onCommands = new Command[7];
    offCommands = new Command[7];
    for (int i = 0; i<7; i++){
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }
  
  public void setCommand(int slot, Command onCommand, Command offCommand){
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }
  public void onButtonPushed(int slot){
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }
  public void offButtonPushed(int slot){
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }
  public void undoButtonPushed(){
    undoCommand.undo();
  }
}