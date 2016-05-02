package com.j2.w9.command;


public class LightOnCommand implements Command{
  private Light light;
  public LightOnCommand(Light light){
    this.light=light;
  }
  public void execute(){
    light.on();
  }
}