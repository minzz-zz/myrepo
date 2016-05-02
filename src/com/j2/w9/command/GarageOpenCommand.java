package com.j2.w9.command;


public class GarageOpenCommand implements Command{
  private GarageDoor garage;
  public GarageOpenCommand(GarageDoor garage){
    this.garage=garage;
  }
  public void execute(){
    garage.open();
  }
}