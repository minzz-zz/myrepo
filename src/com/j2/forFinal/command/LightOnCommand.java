package com.j2.forFinal.command;


public class LightOnCommand implements Command{
  Light light;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    light.on();
  }
}