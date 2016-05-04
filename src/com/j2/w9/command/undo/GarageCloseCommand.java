package com.j2.w9.command.undo;


public class GarageCloseCommand implements Command{
  private GarageDoor garage;
  int level;
  public GarageCloseCommand(GarageDoor garage){
    this.garage=garage;
  }
  public void execute(){
    garage.close();
  }
  public void undo(){
    garage.dim(level);
  }
}