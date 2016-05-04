package com.j2.w9.command.undo;


public class GarageOpenCommand implements Command{
  private GarageDoor garage;
  int level;
  public GarageOpenCommand(GarageDoor garage){
    this.garage=garage;
  }
  public void execute(){
    garage.open();
  }
  public void undo(){
    garage.dim(level);
  }
}